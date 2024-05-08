package javaAPI;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override // @Override ������̼�: �޼ҵ尡 ��Ȯ�� �����ǵ� ������ �����Ϸ��� Ȯ��
	public boolean equals(Object obj) { // �������̵��� ����θ� ������ �� ����, ó���θ� ������ ����
		// equals(Object obj) ���� �����, ���� { } ���δ� ó����
		if (obj instanceof Member) { 
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
