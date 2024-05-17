package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInsertExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// JDBC Driver ���
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// �����ϱ�
			// �� useUnicode=true&characterEncoding=utf8: DB �ѱ۱��� �ذ�
			conn = DriverManager.getConnection(
									"jdbc:mysql://localhost:3306/servletex?useUnicode=true&characterEncoding=utf8",
									"root",
									"1234"
			);
			
			// �Ű�����ȭ�� SQL�� �ۼ�
			String sql = "" +
								"INSERT INTO users(userid, username, userpassword, userage, useremail)" +
								"VALUES(?, ?, ?, ?, ?)";
			
			// PreparedStatement ��� �� �� ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			pstmt.setString(2, "�Ѱܿ�");
			pstmt.setString(3, "12345");
			pstmt.setInt(4, 25);
			pstmt.setString(5, "winter@mycompany.com");
			
			// SQL�� ����
			int rows = pstmt.executeUpdate(); // executeUpdate(): DB�� ���� ���� 
			System.out.println("����� �� ��: " + rows);
			
			// PreparedStatement �ݱ�
			pstmt.close();			// ���߿� ������ ��ü�� ���� �ݱ�
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// ���� ����
					conn.close();		// ��ü ���� �� ���� ������ ��ü ���߿� �ݱ�
				} catch (SQLException e) {}
			}
		}
	}
}
