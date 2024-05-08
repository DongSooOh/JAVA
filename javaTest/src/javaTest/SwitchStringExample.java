package javaTest;

public class SwitchStringExample {
	public static void main(String[] args) {
		
		String position = "과장";
		
		switch(position) {
			case "부장":
				System.out.println("700만 원");
				break;
			case "과장":
				System.out.println("500만 원");
				break;
			default:
				System.out.println("300만 원");
		}
	}
}
