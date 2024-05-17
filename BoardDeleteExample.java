package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {
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
			String sql = "DELETE FROM boards WHERE bwriter=?";
			
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			// SQL문 실행
			int rows = pstmt.executeUpdate(); // executeUpdate(): DB를 상대로 실행
			System.out.println("삭제된 행 수: " + rows);
			
			// PreparedStatement 닫기
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
