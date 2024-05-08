package class7;

class Data{
	int m;
	Data(int x){
		m = x;
	}
	void printData() {
		System.out.println("m : " + m);
	}
}

public class Code103 {

	public static void main(String[] args) {
		Data d = new Data(10); // 매개변수가 있으므로 에러 발생하지 않고, new Data();로 하면 디폴트 생성자가 없으므로 에러 발생
		  d.printData();       // 에러 메시지: The constructor Data() is undefined

	}

}
