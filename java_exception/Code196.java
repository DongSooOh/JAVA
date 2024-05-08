package java12;

public class Code196 {

	public static void main(String[] args) 
	{
		int n[] = {1, 3, 5, 6, 10};
		int i = 0;
		try {
				for (i=0; i<=5; i++) {
					System.out.println("n[" + i + "] = " + n[i]);
				}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("n[" + i + "]" + "는 없는 인덱스입니다.");
			System.out.println(e.getMessage()); // 예외에 대한 설명 반환
			// 최상위 클래스인 Throwable의 메소드라 사용이 가능
			//System.out.println(e.printStackTrace()); // 발생한 예외에 대한 정보 반환
		}
		catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
	}
}
