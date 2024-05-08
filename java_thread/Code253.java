package java15;

class NumberThread2 extends Thread{
	public void run() {
		for (int i = 1; i <= 26; i++) {
			System.out.print(i);
			try {
					Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class CharThread extends Thread{
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch);
		try {
				Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Code253 {
	public static void main(String[] args) 
	{
		Thread t1 = new NumberThread2(); // 스레드 t1 생성
		Thread t2 = new CharThread(); // 스레드 t2 생성
		t1.start(); // t1의 run()메소드 수행
		t2.start(); // t2의 run()메소드 수행
		for (char ch = 'A'; ch <= 'z'; ch++) {
			System.out.print(ch);
			try {
					Thread.sleep(1000);
			} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	} // 스레드 10:06부터
