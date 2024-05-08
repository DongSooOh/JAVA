package polymorphismField;

public class HankookTire extends Tire {

	// 필드

	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // super() 메소드로 Tire의 생성자 호출
	}

	// 메소드
	@Override // 메소드가 정확히 재정의된 것인지 컴파일러가 확인
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("********** " + location + " HankookTire 펑크 **********");
			return false;
		}
	}
}
