package interfaceCasting;

public class Driver {
	public void dirve(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
