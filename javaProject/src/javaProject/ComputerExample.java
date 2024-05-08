package javaProject;

public class ComputerExample {
	public static void main(String[] args) {

		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 }; // 1번,
		int result1 = myCom.sum1(values1); // 2번 이렇게 2줄로 구분해서 작성하는 것을 선호
		System.out.println("result1: " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 }); // 선호하는 방식은 아님
		System.out.println("result2: " + result2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);

	}

}
