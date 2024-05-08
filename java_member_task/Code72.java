// 배열 data에서 원소를 하나씩 가져와 x에 저장함 
public class Code72 {

	public static void main(String[] args) {
		int data[] = {4, 2, 9, 10, 1};
		for (int x : data) { 
			System.out.println(x);

		// 성적의 평균
		double[] score = {90.5, 88.3, 70.8, 67.2, 92.4, 80.7};
		double total = 0.0;
		double average;
		
		for (double s : score)
			total += s;
		average = total / score.length;
		System.out.println("average :" + average);
	}
  }
}
