package interfaceCasting;

public class VehicleExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run(); // ���� vehicle��  Vehicle Ÿ���� Bus �ν��Ͻ�
		// vehicle.checkFare(); ( X )
		
	//	Bus bus = (Bus) vehicle; // ���� Ÿ�� ��ȯ, 'instanceof'�� ����Ͽ� ��ȿ�� �˻�
		//bus.run();
		//bus.checkFare();
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		} else {
			System.out.println("��ȿ���� ���� ���� �����Դϴ�.");
		}
	}
}
