package member;

class Student{
	String id;
	String pw;
	String address;
	String email;
	
	Student(String id, String pw, String address, String email){
		this.id = id;
		this.pw = pw;
		this.address = address;
		this.email = email;
	}
	void result() {
		System.out.println("학생 정보");
		System.out.println("--------------------------");
		System.out.println("ID: " + id);
		System.out.println("PW: " + pw);
		System.out.println("Address: " + address);
		System.out.println("Email: " + email);
	}
}

public class Member {

	public static void main(String[] args)
	{
		Student student = new Student("12345", "abcde", "서울특별시 강남구 역삼동", "student@school.com");
		student.result();
	}
}