package java16;

interface Test1{
	int getSum(int n);
}

public class Code267 {
	public static void main(String[] args) {
		
		Test1 t = (n) -> {
			
			int result = 0;
			for (int i =1; i <= n; i++)
				result += i;
			return result; // 1부터 n까지의 합을 구하는 코드
		}; // 중괄호 닫고 반드시 세미콜론을 붙여야 함.
		
		System.out.println("sum from 1 to 10 is " + t.getSum(10));
		System.out.println("sum from 1 to 20 is " + t.getSum(20));
		System.out.println("sum from 1 to 30 is " + t.getSum(30));
	}
}
