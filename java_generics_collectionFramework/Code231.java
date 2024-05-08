package java14;

class Data3<T extends Number> { // Number 클래스의 하위 클래스 타입
	T obj;
	Data3(T ob){
		obj = ob;
	}
	int calcMultiple(int n) {
		return obj.intValue() * n;
	}
}

public class Code231 {

	public static void main(String[] args) {
		Data3<Integer> d = new Data3<Integer>(100); // Integer는 Number의 하위 클래스
		int result = d.calcMultiple(5);
		System.out.println(result);
		
		Data3<Double> e = new Data3<Double>(17.5); // Double 역시 Number의 하위 클래스
		int result2 = e.calcMultiple(5);
		System.out.println(result2);
	}
}
