package java12;

public class Code206 { // makeArray() 메소드에서 예외가 발생하는데 예외처리를 하지 않음.
	// 대신 throws 구문을 이용해서 'makeArray() 메소드를 호출하는 메소드'에게 예외 처리를 하도록 함
	
public static void makeArray() throws ArrayIndexOutOfBoundsException
{ 	// 'throws ~ Exception'은 makeArray()에서 ArrayIndexOutOfBoundsException이 
	// 발생하면 makeArray()를 호출한 곳에서 예외 처리하라는 의미
		int A[] = new int[3];
		
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		A[4] = 50;
		
} 

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		try {
				makeArray(); // makeArray()에서 예외가 발생하면 여기에서 처리
		}
		catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception message : " + e.getMessage());	
		}
		System.out.println("main ends");
	}
} //Index 3 out of bounds for length 3는 배열의 인덱스가 3이고, 배열의 길이가 3인데 이 인덱스가 범위를 벗어남
