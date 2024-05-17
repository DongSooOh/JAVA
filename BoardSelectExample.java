package mySQL;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BoardSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// JDBC Driver ���
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// �����ϱ�
			// useUnicode=true&characterEncoding=utf8: DB �ѱ� �����ذ�
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/servletex?useUnicode=true&characterEncoding=utf8",
					"root",
					"1234"
			);
			
			// �Ű�����ȭ�� SQL�� �ۼ�
			String sql = "" + 	"SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata " +
								"FROM boards " +
								" WHERE bwriter=?";
			
			// PreparedStatement ��� �� �� ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			// SQL�� ���� �� ResultSet�� ���� ������ �б�
			ResultSet rs = pstmt.executeQuery();
			
			// ������ ���� �а� Board ��ü ����
			// �Ʒ�ó�� while�� �ۿ��� ������ �����ϴ� ���� �ٶ�����
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				String bwriter = rs.getString("bwriter");
				Date bdate = rs.getDate("bdate");
				String bfilename = rs.getString("bfilename");
				Blob bfiledata = rs.getBlob("bfiledata");
				
				Board board = new Board();
				
				board.setBno(bno);
				board.setBtitle(btitle);
				board.setBcontent(bcontent);
				board.setBwriter(bwriter);
				board.setBdate(bdate);
				board.setBfilename(bfilename);
				board.setBfiledata(bfiledata);
				
				// �Ʒ� board���� toString() �������� ������ toString(board) ����
				System.out.println(board);
				
				// ���Ϸ� ����
				Blob blob = board.getBfiledata();
				if (blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("C:/Temp/" + board.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
			}
			rs.close();
			
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
