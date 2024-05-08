package movie;

import java.util.ArrayList;
import java.util.List;

// ���� ������ �����ϴ� Ŭ����, ������ ���� ����� ���
public class Reservation {

	private List<String> reservedSeats;
	private List<String> reservedMovies;
	private List<Long> reservationTimestamps;
	
	public Reservation() {
		reservedSeats = new ArrayList<>();
		reservedMovies = new ArrayList<>();
		reservationTimestamps = new ArrayList<>();
	}
	
	public boolean isSeatReserved(String seat) {
	    return reservedSeats.contains(seat);
	}
	
	public void addReservation(String seat, String movieName) {
	    if (!isSeatReserved(seat)) { // �̹� ����� �¼����� Ȯ��
	        reservedSeats.add(seat);
	        reservedMovies.add(movieName);
	        long timeStamp = System.currentTimeMillis();
	        reservationTimestamps.add(timeStamp);
	        System.out.println("���Ű� ���������� �Ϸ�Ǿ����ϴ�.");
	        System.out.println("�߱޹�ȣ: " + timeStamp + ", ��ȭ: " + movieName + ", �¼�: " + seat);
	    } else {
	        System.out.println("�̹� ����� �¼��Դϴ�.");
	    }
	}
	
	public boolean removeReservation(String seat) {
		int index = reservedSeats.indexOf(seat);
		if (index != -1) {
			reservedSeats.remove(index);
			reservedMovies.remove(index);
			return true;
		}
		return false;
	}
	
	public void displayReservation() {
		System.out.println("���� ����: ");
		for (int i = 0; i < reservedSeats.size(); i++) {
			System.out.println(reservedSeats.get(i) + " " + reservedMovies.get(i));
		}
	}
	
	/*
	public boolean isSeatReserved(String seat) {
		return reservedSeats.contains(seat);
	} */
}
