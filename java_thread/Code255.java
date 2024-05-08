package java15;

class NumberThread4 extends Thread{
		String name;
		NumberThread4(String name){
				this.name = name;
		}
		public void run() {
				System.out.println(name + " sarting");
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
public class Code255 {
	public static void main(String[] args) 
	{
		System.out.println("main starting");
		Thread th = new NumberThread4("Number Thead");
		th.start();
		for (int i = 0; i < 10; i++) {
				try {
						Thread.sleep(300);
						System.out.println("In main : " + i);
				} catch(InterruptedException e) {
						System.out.println(e);
				}
		}
		System.out.println("main ending ");
	} 
}
