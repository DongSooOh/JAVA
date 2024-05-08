package class7;

class Circle{
	static double PI = 3.141592; // static 변수로 같이 공유
	double radius; // 반지름
	
	Circle(double radius){ 
		this.radius = radius;
	}
	
	double area() {
		return this.radius * this.radius * PI; // 원의 넓이 계산하는 표준적인 공식: πr2 
		
	}
	
	double perimeter() {
		return 2 * PI * this.radius;
	}
}


public class Code114 {

	public static void main(String[] args) 
	{
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(100.0);
		
		System.out.println("area of c1 : " + c1.area());
		System.out.println("perimeter of c1 : " + c1.perimeter());
		System.out.println("area of c2 : " + c2.area()); // 31415.92는 정확한 이진 표현이 불가능하며, 표현하는 데 한계가 있어 근사값으로 표현.
		System.out.println("perimeter of c2 : " + c2.perimeter());
		
		System.out.println("Static 변수 PI : " + Circle.PI); // 클래스명.변수명
		// static 변수는 클래스당 하나로 객체를 생성하지 않아도 됨

	} // 위 부동 소수점 정밀도 문제를 피하려면 'BigDecimal'과 같은 정밀한 숫자 계산용 클래스 사용하는 것을 권장함.

}
