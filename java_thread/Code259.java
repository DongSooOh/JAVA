package java15;

class ChildThread2 extends Thread{
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
}
public class Code259 {
	public static void main(String[] args) {
		Thread th = new ChildThread2();
		th.start();
		for (int i = 1; i <= 26; i++)
				System.out.print(i);
		try {
				th.join(); // join()는 예외처리가 있어야 함. 
		} catch(InterruptedException ex) { // join()에 대한 예외처리
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread ending");
	}
}