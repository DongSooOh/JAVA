package mySQL;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExample {
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
			// �Ʒ� �ڵ�� ����
			// String sql = new StringBuilder()	= ""+ UPDATE boards SET btitle=?, bcontent=?, bfilename=?, bfiledata=? WHERE bno=?;
			String sql = new StringBuilder()
											.append("UPDATE boards SET ")
											.append("btitle=?, ")
											.append("bcontent=?, ")
											.append("bfilename=?, ")
											.append("bfiledata=? ")
											.append("WHERE bno=?")
											.toString();
			
			// PreparedStatemenet ��� �� �� ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "�����");
			pstmt.setString(2, "������ ���� ���");
			pstmt.setString(3, "snowman.jpg");
			pstmt.setBlob(4, new FileInputStream("C:/web/mySQL/src/main/java/mySQL/images/snowman.jpg"));
			pstmt.setInt(5, 1); // boards ���̺� �ִ� �Խù� ��ȣ(bno) ����
			
			// SQL�� ����
			int rows = pstmt.executeUpdate(); // executeUpdate(): DB�� ���� ����
			System.out.println("������ �� ��: " + rows);
			
			// PreparedStatement �ݱ�
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// ���� ����
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
