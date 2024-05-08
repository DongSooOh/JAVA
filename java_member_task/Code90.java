
public class Code90 {
    // 아래와 같이 일반 인수와 가변 인수를 섞어서 사용할 경우 가변 인수는 맨 마지막에 위치
	public static int largerThanValue(int value, int... v)
	{
		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= value)
				sum += v[i];
		}
		return sum;
	}
	
	/* 현재 10은 맨 앞에 있으므로 value 매개변수로 지정, 
	그 뒤인 5부터 15까지는 가변 인수로 지정 */
	
	public static void main(String[] args) 
	{
	    int largerSum;
	  largerSum = largerThanValue(10, 5, 3, 11, 17, 2, 20, 15);
	    System.out.println("sum : " + largerSum);

	}

}
