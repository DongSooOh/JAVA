package javaAPI;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {

		// �齽����('\')�� �̽������� ���ڸ� ��Ÿ���� �� ���Ǿ� \d�� ǥ���Ϸ��� \\d�� �ۼ��ؾ� \'\d'�� ǥ����
				String regExp = "(02|010)-\\d{3,4}-\\d{4}"; 
		String data = "010-123-4567";

		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.err.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";

		result = Pattern.matches(regExp, data);

		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
	}
}