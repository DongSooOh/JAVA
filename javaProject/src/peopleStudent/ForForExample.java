package peopleStudent;

public class ForForExample {

	public static void main(String[] args) {
				
		System.out.println("������ ����");
		for (int x = 1; x <= 9; x++) {
			
			System.out.println("----------" + x + "�� ----------");
			
			for (int y = 1; y <= 9; y++) {
			System.out.println(x + " x " + y + "= " + (x * y));
			}	
		}
		System.out.println("������ ��");

	}

}
