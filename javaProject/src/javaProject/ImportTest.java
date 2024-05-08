package javaProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		// YYYY: 주, yyyy: 올해의 년도
		// DD: '년 중 일'(연도의 시작부터 현재 날짜까지의 누적 일 수), dd: '월 중 일'(현재 월에서의 날짜)
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");
		// A, a: 대소문자 구분 없이 오전, 오후를 나타냄
		// HH: 24시간 형식으로 시간, MM: 월, SS: '년 중 초'(1년부터 365일까지의 숫자로 표시)
		// hh: 시간, mm: 분, ss: 초		
		System.out.println("오늘 날짜는 " + date.format(today) + "입니다.");
		System.out.println("현재 시각은 " + time.format(today) + "입니다.");
	}
}

