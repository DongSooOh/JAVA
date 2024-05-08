package java16;

enum Cards2{
	HEART(10), CLUB(20), SPADE(30), DIAMOND(40);
	
	private int val;
	Cards2(int v){ val = v; }
	int getVal() { return val; }
}

public class Code271 {
	public static void main(String[] args) {
		// @SuppressWarnings("unused") 를 작성하면 아래줄에서 워닝이 나오지 않음.
		Cards2 cd;
		System.out.println("Value of SPADE : " + Cards2.SPADE.getVal());
		System.out.println("-----------------");
		System.out.println("All values of Cards");
		
		for (Cards2 c : Cards2.values())
				System.out.println(c + " value : " + c.getVal());
	}
}
