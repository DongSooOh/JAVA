package boardProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class MemberExam {
	// �ʵ�
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	
	// ������
	public MemberExam() {
		try {
			// JDBC Driver ���
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// �����ϱ�
			conn = DriverManager.getConnection(
					// useUnicode=true&characterEncoding=utf8: DB �ѱ� ���� �ذ�
					"jdbc:mysql://localhost:3306/servletex?useUnicode=true&characterEncoding=utf8",
					"root",
					"1234"
			);
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	// �޼ҵ�
	public void list() {
		// Ÿ��Ʋ �� �÷��� ���
		System.out.println();
		System.out.println("[ȸ�� ���]");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "���̵�", "�̸�", "email", "��������");
		System.out.println("-----------------------------------------------------------------");
		
		// boards ���̺��� �Խù� ������ �����ͼ� ����ϱ�
		try {
			String sql = "SELECT id, name, email, joinDate FROM t_member order by joinDate desc" ;
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Member member = new Member();
				String id = rs.getString("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				member.setId(id);
				member.setName(name);
				member.setEmail(email);
				member.setJoinDate(joinDate);
				
				// System.out.printf(): ���˿� ���缭 ���
				// %-6s: member.getId()�� ����, %-12s: member.getName()�� ����,
				// %-16s: member.getEmail()�� ����, %-40s: member.getJoinDate()�� ����
				System.out.printf("%-6s%-12s%-16s%-40s\n", member.getId(), member.getName(),
									member.getEmail(), member.getJoinDate());
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		// ���� �޴� ���
		mainMenu();
	}
		
	public void mainMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("���θ޴�: 1.ȸ������ | 2.ȸ������ | 3.ȸ������ | 4.���α׷� ����");
		System.out.print("�޴�����:");
		
		String menuNo = scanner.nextLine();
		System.out.println();
		
		switch(menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> clear();
			case "4" -> exit();
		}
	}
	
	public void create() {
		// �Է� �ޱ�
		Member member = new Member();
		System.out.println("[ȸ������]");
		
		System.out.print("���̵�: ");
		member.setId(scanner.nextLine());
		
		System.out.print("��й�ȣ: ");
		member.setPwd(scanner.nextLine());
		
		System.out.print("�̸�: ");
		member.setName(scanner.nextLine());
		
		System.out.print("email: ");
		member.setEmail(scanner.nextLine());
		
		// �����޴� ���
		System.out.println("-----------------------------------------------------------------");
		System.out.println("�����Ͻðڽ��ϱ�? 1.OK | 2.Cancel");
		System.out.print("�޴�����: ");
		String menuNo = scanner.nextLine();
		
		if(menuNo.equals("1")) {
			// boards ���̺� �Խù� ���� ����
			try {
				String sql = "" + "INSERT INTO t_member(id, pwd, name, email, joinDate) " 
								+ "VALUES(?, ?, ?, ?, now())";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPwd());
				pstmt.setString(3, member.getName());
				pstmt.setString(4, member.getEmail());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		// �Խù� ��� ���
		list();
	}
	
	public void read() {
		// �Է¹ޱ�
		System.out.println("[ȸ�� ����]");
		System.out.print("���̵�: ");
		String _id = scanner.nextLine();
		
		// boards ���̺��� �ش� �Խù��� ������ ���
		try {
			String sql = "SELECT id, name, email, joinDate FROM t_member WHERE ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, _id);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				Member member = new Member();
				String id = rs.getString("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				member.setId(id);
				member.setName(name);
				member.setEmail(email);
				member.setJoinDate(joinDate);
				
				System.out.println("#############");
				System.out.println("���̵�: " + member.getId());
				System.out.println("�̸�: " + member.getName());
				System.out.println("email: " + member.getEmail());
				System.out.println("���Գ�¥: " + member.getJoinDate());
				
				// �����޴� ���
				System.out.println("-----------------------------------------------------------------");
				System.out.println("ȸ������: 1.Update | 2.Delete | 3.List");
				System.out.print("�޴�����: ");
				
				String menuNo = scanner.nextLine();
				System.out.println();
				
				if(menuNo.equals("1")) {
					update(member);
				} else if (menuNo.equals("2")) {
					delete(member);
				}
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
		// �Խù� ��� ���
		list();
	}
	
	public void update(Member member) {
		
		// ���� ���� �Է¹ޱ�
		System.out.println("[���� ���� �Է�]");
		System.out.print("�̸�: ");
		member.setName(scanner.nextLine());
		System.out.print("��й�ȣ: ");
		member.setPwd(scanner.nextLine());
		System.out.print("email: ");
		member.setEmail(scanner.nextLine());
		
		// �����޴� ���
		System.out.println("-----------------------------------------------------------------");
		System.out.println("�����Ͻðڽ��ϱ�? 1. OK | 2.Cancel");
		System.out.print("�޴�����: ");
		String menuNo = scanner.nextLine();
		
		if (menuNo.equals("1")) {
			// boards ���̺��� �Խù� ���� ����
			try {
				String sql = "" + "UPDATE t_member SET pwd=?, name=?, email=? WHERE id=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, member.getPwd());
				pstmt.setString(2, member.getName());
				pstmt.setString(3, member.getEmail());
				pstmt.setString(4, member.getId());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		// �Խù� ��� ���
		list();
	}
	
	public void delete(Member member) {
		// boards ���̺� �Խù� ���� ����
		try {
			String sql = "DELETE FROM t_member WHERE id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e){
			e.printStackTrace();
			exit();
		}
		
		// �Խù� ��� ���
		list();
	}
	
	public void clear() {
		System.out.println("[ȸ�� ��ü����]");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("ȸ����ü�� �����Ͻðڽ��ϱ�? 1.OK | 2.Cancel");
		System.out.print("�޴�����: ");
		String menuNo = scanner.nextLine();
		
		if (menuNo.equals("1")) {
			// boards ���̺� �Խù� ���� ��ü����
			try {
				String sql = "TRUNCATE TABLE t_member";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		// �Խù� ��� ���
		list();
	}
	
	public void exit() {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
			System.out.println("***** ȸ�� �Խ��� ���� *****");
			System.exit(0);
		}
	
		public static void main(String[] args) {
			MemberExam memberExam = new MemberExam();
			memberExam.list();
	}
}
