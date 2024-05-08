package javaTest;

public class AdvancedForExample {
	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		
		/* for ( 타입 변수 : 배열 ){ // 이때 세미콜론(;)이 아닌, 콜론(:)을 써야 함
		 			실행문
		   } */
		System.out.println("점수 총합: " + sum);

		double avg = (double) sum / scores.length; // sum은 int형으로 일시적으로 double형으로 변환됨
		System.out.println("점수 평균: " + avg);

	}

}
