package javaTest;

public class ArrayCopyExample {
	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

// System.arraycopy(���� �迭, ���� �迭���� ���縦 ������ ��ġ, ��� �迭, ��� �迭���� ���縦 ������ ��ġ, ������ ����� ��)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}
}
