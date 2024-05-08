package javaProject;

public class Television {
	
	// 초기화 순서는 명시적 초기화 → 생성자를 통한 초기화 → 블록 초기화 순으로 진행
	static String company = "Samsung"; // 명시적 초기화
	static String model = "LCD";
	static String info;	// 블록 초기화

	static {
		info = company + "-" + model;
	}
}
