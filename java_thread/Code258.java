package java15;

class ChildThread1 extends Thread{
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
}
public class Code258 {
	public static void main(String[] args) {
		Thread th = new ChildThread1();
		th.start();
		do {
				System.out.print("*");
		} while (th.isAlive());
	}
}