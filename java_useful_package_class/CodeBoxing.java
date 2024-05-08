package java11;

public class CodeBoxing {

	public static void main(String[] args) 
	{ /*
		boxing : 기본 자료형을 인스턴스로 변환
		unboxing : 인스턴스로 된 데이터를 가본 자료형으로 변환
		
		Auto-boxing : 자동으로 박싱되는 것
		Auto-unboxing : 자동으로 언박싱되는 것
	*/
		Integer x = new Integer(100);
		/* boxing (기본 자료형의 데이터 → 인스턴스(객체))
		   x(인스턴스), Integer(100)(기본 자료형, Int형)*/
		int y = x.intValue();
		// unboxing (인스턴스(객체) → 기본 자료형의 데이터)
		
		Integer a = 100;
		// Auto-boxing(기본 자료형 100이 자동으로 인스턴스 a로 변환)
		
		Integer b = new Integer(100);
		int c = b;
		// Auto-unboxing(인스턴스 b가 자동으로 기본 자료형 100으로 변환)
		

	}

}
