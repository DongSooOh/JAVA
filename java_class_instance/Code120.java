package class7;

class Data2{
	//private int x;   같은 클래스 내에서만 접근이 가능
	public int y;  // 어디에서나 접근이 가능
	int z;         // (default)접근 제어로 같은 패키지 내에서 접근이 가능

}

public class Code120 {

	public static void main(String[] args)
	{
		Data2 data = new Data2();
		//data.x = 10; private로 같은 클래스 내에서만 접근이 가능
		data.y = 20;
		data.z = 30;
 


	}

}
