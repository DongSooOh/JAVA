package movie;

import java.util.ArrayList;
import java.util.List;

// 예매 정보를 관리하는 클래스, 예매의 파일 입출력 담당
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
	    if (!isSeatReserved(seat)) { // 이미 예약된 좌석인지 확인
	        reservedSeats.add(seat);
	        reservedMovies.add(movieName);
	        long timeStamp = System.currentTimeMillis();
	        reservationTimestamps.add(timeStamp);
	        System.out.println("예매가 성공적으로 완료되었습니다.");
	        System.out.println("발급번호: " + timeStamp + ", 영화: " + movieName + ", 좌석: " + seat);
	    } else {
	        System.out.println("이미 예약된 좌석입니다.");
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
		System.out.println("예매 정보: ");
		for (int i = 0; i < reservedSeats.size(); i++) {
			System.out.println(reservedSeats.get(i) + " " + reservedMovies.get(i));
		}
	}
	
	/*
	public boolean isSeatReserved(String seat) {
		return reservedSeats.contains(seat);
	} */
}
