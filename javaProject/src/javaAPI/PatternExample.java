package javaAPI;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {

		// 백슬래시('\')는 이스케이프 문자를 나타내는 데 사용되어 \d를 표현하려면 \\d로 작성해야 \'\d'로 표현됨
				String regExp = "(02|010)-\\d{3,4}-\\d{4}"; 
		String data = "010-123-4567";

		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.err.println("정규식과 일치하지 않습니다.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";

		result = Pattern.matches(regExp, data);

		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}