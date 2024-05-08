package java910;

public interface Data {
	int count = 100; // 상수, public static final 생략
	void print(); // 추상 메소드, public abstract 생략
}

/*  자바 버전 7까지에서는 인터페이스는 상수 + 추상 메소드만으로 구성
    따라서 인터페이스 내 상수는 public static final로 간주,
    추상 메소드는 public abstract로 간주하여 생략이 가능
    여기서 count는 사용이 가능하나 print는 자식 클래스 생성한 다음
    print() 메소드 오버라이딩 후에 사용이 가능 
  */
