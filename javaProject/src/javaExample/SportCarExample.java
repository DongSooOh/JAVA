package javaExample;

public class SportCarExample {
	public static void main(String[] args) {

		SportCar sc = new SportCar();
		
		sc.start();
				
		System.out.println("현재 속도: " + sc.speed);
		
		while (sc.speed < 50) {
			sc.speedUp();
			System.out.println("현재 속도: " + sc.speed);
		}
		
		sc.stop();
		System.out.println("현재 속도: " + sc.speed);
	}
}