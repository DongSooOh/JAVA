package java15;

class NumberThread extends Thread {
		public void run() { // run()메소드 오버라이딩
			for (int i = 1; i <= 26; i++)
				System.out.print(i);
	}
}
public class Code251 {
	public static void main(String[] args) 
	{
		Thread t = new NumberThread();
		t.start(); // start()로 run()메소드 호출
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
	}
}
