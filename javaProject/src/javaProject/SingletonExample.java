package javaProject;

public class SingletonExample {
	public static void main(String[] args) {
	/*
		Singleton obj1 = new Singleton(); // 컴파일 에러
		Singleton obj2 = new Singleton(); // private으로 제한해두어 new 예약어는 사용이 불가
	*/	
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) { // 주소값 비교
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}

