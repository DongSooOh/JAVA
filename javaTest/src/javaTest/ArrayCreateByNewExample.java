package javaTest;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {

		int[] arr1 = new int[3]; // int 타입 3개의 비어있는 인덱스(0)를 가진 배열 객체를 생성
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}

		double[] arr2 = new double[3]; // double 타입 3개의 비어있는 인덱스(0.0)를 가진 배열 객체를 생성
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}

		String[] arr3 = new String[3]; // 참조형 String 타입 3개의 비어있는 인덱스(null)를 가진 배열 객체를 생성
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
	}
}
