package java15;

class NumberThread5 extends Thread{
	String name;
	NumberThread5(String name){
		this.name = name;
	}
	public void run() {
		System.out.println(name + " starting");
		try {
				for (int i = 0; i < 10; i++) {
						Thread.sleep(300);
						System.out.println("In " + name + " : " + i);
				}
		} catch (InterruptedException e) {
				System.out.println(e);
		}
		System.out.println(name + " terminating");
	}
}
class CharThread2 implements Runnable{
	String name;
	CharThread2(String name){
		this.name = name;
	}
	public void run() {
		System.out.println(name + " starting");
		try {
				for (char i = 'A'; i <= 'J'; i++) {
						Thread.sleep(300);
						System.out.println("In " + name + " : " + i);
				}
		} catch (InterruptedException e) {
				System.out.println(e);
		}
		System.out.println(name + " terminating");
	}
}
public class Code256 {
	public static void main(String[] args) 
	{
		System.out.println("main starting");
		Thread th1 = new NumberThread5("Number Thread");
		Thread th2 = new Thread(new CharThread2("Character Thread"));
		th1.start();
		th2.start();
		for (int i = 0; i < 10; i++) {
				try {
						Thread.sleep(300);
						System.out.println("In main : " + i);
				} catch (InterruptedException e) {
						System.out.println(e);
				}
		}
		System.out.println("main ending");
	}
}
