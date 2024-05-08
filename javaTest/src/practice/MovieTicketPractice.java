package practice;

public class MovieTicketPractice {
	public static void main(String[] args) throws Exception {

		boolean movie = true;
		int ticket = 0;
		int keyCode = 0;

		System.out.println("영화 예매 프로그램");

		while (movie) {
			if (keyCode != 13 && keyCode != 10) { // 10: 줄 바꿈, 13: 캐리지 리턴

				System.out.println("------------------------------------");
				System.out.println("1. 영화 예매 | 2. 예매 취소 | 3. 중지");
				System.out.println("------------------------------------");
				System.out.println("선택: ");
			}
			keyCode = System.in.read();

			if (keyCode == 49) { // 49: 1, 48: 0
				ticket++;
				System.out.println("영화 예매가 완료되었습니다. 현재 예매된 영화는 " + ticket + "매 입니다.");
			} else if (keyCode == 50) { // 50: 2
				if (ticket > 0) {
					ticket--;
					System.out.println("영화 예매가 취소되었습니다. 현재 예매된 영화는 " + ticket + "매 입니다.");
				} else {
					System.out.println("취소할 예매가 없습니다.");
				}
			} else if (keyCode == 51) { // 51: 3
				movie = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
//** 유니코드 문자표 10: 줄 바꿈, 13: 캐리지 리턴, 48: 0, 65: A, 97: a **