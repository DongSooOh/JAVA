package java15;

class NumberThread1 extends Thread{
	public void run() {
			for (int i = 1; i <= 26; i++) {
					System.out.print(i);
					try {
							Thread.sleep(1000); // 1초동안 쉼. sleep()메소드의 인수는 밀리세컨드로 1000이 1초	
						} catch (InterruptedException e) {
							System.out.println(e.getMessage());
						}
				}
		}
}
public class Code252 {
	public static void main(String[] args) 
	{
		Thread t = new NumberThread1();
		t.start();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
					Thread.sleep(1000);
			} catch (InterruptedException e) {
					System.out.println(e.getMessage());
			}
		}
	}
}
