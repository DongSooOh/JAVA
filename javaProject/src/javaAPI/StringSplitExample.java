package javaAPI;

public class StringSplitExample {
	public static void main(String[] args) {
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		/*
			split(): 정규표현식을 구분자로 해서 부분 문자열로 분리 후 '배열'에 저장
			|: split() 메소드에서 구분자를 2개 이상 사용할 때 구분자들을 구분하여 문자열을 분할해줌
		*/
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
