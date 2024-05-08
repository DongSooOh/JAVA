package java12;

public class Code193a {

	public static void main(String[] args) 
	{
		int n[] = {1, 3, 5, 6, 10};
		for (int i=0; i<=5; i++) {
			System.out.println("n[" + i + "] = " + n[i]);
		}
		

	}

}
/*
 	n[5]가 예외, 인덱스 5가 없음(for 구문에서 i<5 였으면 예외가 발생하지 않음)
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at java12.Code193a.main(Code193a.java:9)
 */