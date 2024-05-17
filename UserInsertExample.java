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
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결하기
			// ★ useUnicode=true&characterEncoding=utf8: DB 한글깨짐 해결
			conn = DriverManager.getConnection(
									"jdbc:mysql://localhost:3306/servletex?useUnicode=true&characterEncoding=utf8",
									"root",
									"1234"
			);
			
			// 매개변수화된 SQL문 작성
			String sql = "" +
								"INSERT INTO users(userid, username, userpassword, userage, useremail)" +
								"VALUES(?, ?, ?, ?, ?)";
			
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			pstmt.setString(2, "한겨울");
			pstmt.setString(3, "12345");
			pstmt.setInt(4, 25);
			pstmt.setString(5, "winter@mycompany.com");
			
			// SQL문 실행
			int rows = pstmt.executeUpdate(); // executeUpdate(): DB를 상대로 실행 
			System.out.println("저장된 행 수: " + rows);
			
			// PreparedStatement 닫기
			pstmt.close();			// 나중에 생성한 객체를 먼저 닫기
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 연결 끊기
					conn.close();		// 객체 생성 후 먼저 생성한 객체 나중에 닫기
				} catch (SQLException e) {}
			}
		}
	}
}
