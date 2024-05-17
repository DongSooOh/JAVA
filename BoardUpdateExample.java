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
			// 아래 코드와 동일
			// String sql = new StringBuilder()	= ""+ UPDATE boards SET btitle=?, bcontent=?, bfilename=?, bfiledata=? WHERE bno=?;
			String sql = new StringBuilder()
											.append("UPDATE boards SET ")
											.append("btitle=?, ")
											.append("bcontent=?, ")
											.append("bfilename=?, ")
											.append("bfiledata=? ")
											.append("WHERE bno=?")
											.toString();
			
			// PreparedStatemenet 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "눈사람");
			pstmt.setString(2, "눈으로 만든 사람");
			pstmt.setString(3, "snowman.jpg");
			pstmt.setBlob(4, new FileInputStream("C:/web/mySQL/src/main/java/mySQL/images/snowman.jpg"));
			pstmt.setInt(5, 1); // boards 테이블에 있는 게시물 번호(bno) 지정
			
			// SQL문 실행
			int rows = pstmt.executeUpdate(); // executeUpdate(): DB를 상대로 실행
			System.out.println("수정된 행 수: " + rows);
			
			// PreparedStatement 닫기
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
