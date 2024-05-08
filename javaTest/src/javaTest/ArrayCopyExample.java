package javaTest;

public class ArrayCopyExample {
	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

// System.arraycopy(원본 배열, 원본 배열에서 복사를 시작할 위치, 대상 배열, 대상 배열에서 복사를 시작할 위치, 복사할 요소의 수)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}
}
