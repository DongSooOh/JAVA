package interfaceCasting;

public class VehicleExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run(); // 변수 vehicle은  Vehicle 타입의 Bus 인스턴스
		// vehicle.checkFare(); ( X )
		
	//	Bus bus = (Bus) vehicle; // 강제 타입 변환, 'instanceof'를 사용하여 유효성 검사
		//bus.run();
		//bus.checkFare();
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		} else {
			System.out.println("유효하지 않은 차량 유형입니다.");
		}
	}
}
