package driverInterface;

public interface Vehicle {
	default void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}