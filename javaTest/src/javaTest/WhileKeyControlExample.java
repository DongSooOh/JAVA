package javaTest;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { // 10 : 줄 바꿈, 13: 캐리지 리턴(줄의 끝에 도달한 후 커서를 줄의 시작으로 이동)
				System.out.println("-------------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-------------------------------");
				System.out.println("선택: ");
			}
			keyCode = System.in.read();
			
			if (keyCode == 49) { // 49: 1, 48: 0
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 50) { // 50: 2
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) { // 51: 3
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
// ** 유니코드 문자표 10: 줄 바꿈, 13: 캐리지 리턴, 48: 0, 65: A, 97: a **