package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL_Connection_DB {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// JDBC Driver ��� org.mariadb.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// �����ϱ�
			conn = DriverManager.getConnection(
					// jdbc�� �̿��Ͽ� mysql ����, �ּҴ� localhost:3306, servletex DB�� ����
					"jdbc:mysql://localhost:3306/servletex", // ����
					"root", // ���̵�
					"1234"  // ��й�ȣ
			);
			
			System.out.println("���� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// ���� ����(�޸� ������ ���Ͽ� �ݵ�� �ݾ���� ��)
					conn.close();
					System.out.println("���� ����");
				} catch (SQLException e) {}
			}
		}
	} // java application���� ����
}

