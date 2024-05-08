package class7;
class Data1{  // 패키지 내 Data라는 클래스가 있어서 Data1로 수정.
	int value;        // 인스턴스 변수
	static int count; // 'static'이 붙으면 클래스 변수(정적 변수)로 클래스당 하나, 모든 인스턴스가 공유
	
  void print() {
	  System.out.println("value : " + value++);
	  System.out.println("count : " + count++); 
  }  // d1과 d2가 만들어낸 value는 각각이라 공유되지 않아 둘 다 0이 출력되나,
}    // count는 정적 변수로 공유되어 d2 count에 대한 출력값은 1이 출력됨.

public class Code107 {

	public static void main(String[] args)
	{
		Data1 d1 = new Data1(); // 매개변수가 없어서 디폴트 생성자
		Data1 d2 = new Data1();
		
		d1.print();
		d2.print();
		

	}

}
 