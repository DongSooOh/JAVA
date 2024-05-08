package java16;

enum Cards1{
	HEART, CLUB, SPADE, DIAMOND
}

public class Code270 {
	public static void main(String[] args) {
		Cards1 cd;
		System.out.println("Print out all cards");
		System.out.println("-------------------");
		Cards1 all[] = Cards1.values();
		for (Cards1 c : all)
			System.out.println(c);
		
		System.out.println("-------------------");
		cd = Cards1.valueOf("CLUB");
		System.out.println("cd is " + cd);
		}
}