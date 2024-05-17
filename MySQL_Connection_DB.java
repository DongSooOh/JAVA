package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL_Connection_DB {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// JDBC Driver 등록 org.mariadb.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결하기
			conn = DriverManager.getConnection(
					// jdbc를 이용하여 mysql 연결, 주소는 localhost:3306, servletex DB에 연결
					"jdbc:mysql://localhost:3306/servletex", // 서버
					"root", // 아이디
					"1234"  // 비밀번호
			);
			
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 연결 끊기(메모리 누수로 인하여 반드시 닫아줘야 함)
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}
		}
	} // java application으로 실행
}

