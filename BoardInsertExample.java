package mySQL;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// JDBC Driver ���
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// �����ϱ�
			conn = DriverManager.getConnection(
					// �� useUnicode=true&characterEncoding=utf8: �ش� �κ��� �� �ۼ��ϱ�
					"jdbc:mysql://localhost:3306/servletex?useUnicode=true&characterEncoding=utf8",
					"root",
					"1234"
			);
			
			// �Ű�����ȭ�� SQL�� �ۼ�
			String sql = "" +
							"INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
							"VALUES(?, ?, ?, now(), ?, ?)";
			
			// PreparedStatement ��� �� �� ����
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // bno�� auto_increment�� 'RETURN_GENERATED_KEYS'�� ����ؼ� ���� �ҷ��� 
			pstmt.setString(1, "������ ��");
			pstmt.setString(2, "�Թڴ��� ������.");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			pstmt.setBlob(5, new FileInputStream("C:/web/mySQL/src/main/java/mySQL/images/snow.jpg"));
			
			// SQL�� ����
			int rows = pstmt.executeUpdate(); // executeUpdate(): DB�� ���� ���� 
			System.out.println("����� �� ��: " + rows);
			
			// bno �� ���
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("����� bno: " + bno);
				}
				rs.close();
			}
			// PreparedStatement �ݱ�
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// ���� ����
					conn.close();
				} catch(SQLException e) {}
			}
		}
	}
}
