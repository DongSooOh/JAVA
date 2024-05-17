package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
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
			String sql = "" + "SELECT userid, username, userpassword,userage, useremail " + "FROM users " + " WHERE userid=?";
			
			// PreparedState ��� �� �� ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "spring");
			
			// SQL�� ���� ��, ResultSet�� ���� ������ �б�
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
					User user = new User();
					user.setUserId(rs.getString("userid"));
					user.setUserName(rs.getString("username"));
					user.setUserPassword(rs.getString("userpassword"));
					user.setUserAge(rs.getInt(4)); // �÷� ������ �̿�
					user.setUserEmail(rs.getString(5)); // �÷� ������ �̿�
					System.out.println(user);
			} else {	// ������ ���� �������� �ʾ��� ���
				System.out.println("����� ���̵� �������� ����");
			}
			rs.close();
			
			//PreparedState �ݱ�
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
