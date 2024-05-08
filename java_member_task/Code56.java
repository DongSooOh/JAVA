
public class Code56 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for( i = 1; i <= 10; i++ )
		{
			sum += i;
		}
		System.out.println("sum :" + sum);
/*
        int i = 1, sum = 0;으로 하면 for( ' i <= 10; i++ )으로 가능
        
        또는
        int i = 1, sum = -;
        for( ; i <= 10; )
        {
            sum += i;
            i ++;  두 번째 경우는 for 반복문에서 변화를 주었기 때문에
            동일한 값이 나옴
        }
 */
		int x = 1, sun = 0;
		for( ; ; ) {
			sun += x;
			x ++;
			if(x == 11) break;
		}
		System.out.println("sun :" +sun);
		// 위 경우는 세 부분 모두 비어 무한 루프가 되었고 그래서 break를 넣어줌.
		// sun은 1부터 시작해서 10까지의 수가 되며 동일한 값이 나옴.
	}

}
