package javaAPI;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override // @Override 어노테이션: 메소드가 정확히 재정의된 것인지 컴파일러가 확인
	public boolean equals(Object obj) { // 오버라이딩은 선언부를 변경할 수 없고, 처리부만 변경이 가능
		// equals(Object obj) 까지 선언부, 이후 { } 내부는 처리부
		if (obj instanceof Member) { 
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
