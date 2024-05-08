package javaAPI;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {

		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// 방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); // copyOf(원본배열, 복사할 길이)
		System.out.println(Arrays.toString(arr2));

		// 방법2
		// copyOfRange(원본배열, 시작 인덱스, 끝 인덱스) , 끝 인덱스는 미포함
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); 
		System.out.println(Arrays.toString(arr3));

		// 방법3
		char[] arr4 = new char[arr1.length];
		// System.arraycopy(원본배열, 원본 시작인덱스, 타겟배열, 타겟 시작인덱스, 복사 개수(길이))
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
		
		

	}

}
