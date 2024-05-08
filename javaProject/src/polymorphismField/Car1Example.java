package polymorphismField;

public class Car1Example {
	public static void main(String[] args) {

		Car1 car1 = new Car1();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car1.run();
			if (problemLocation != 0) {
				System.out.println(car1.tires[problemLocation - 1].location + " HankookTire·Î ±³Ã¼");
				car1.tires[problemLocation - 1] = new HankookTire(car1.tires[problemLocation - 1].location, 15);
			}
			System.out.println("------------------------------");
		}
	}
}