package java16;

enum Cards3{
	HEART, CLUB, SPADE, DIAMOND
}

public class Code272 {
	public static void main(String[] args) {
		Cards3 cd1, cd2, cd3;
		
		for (Cards3 c : Cards3.values())
				System.out.println(c + " : " + c.ordinal());
		
		cd1 = Cards3.HEART;
		cd2 = Cards3.SPADE;
		cd3 = Cards3.HEART;
		
		if (cd1.compareTo(cd2) < 0)
				System.out.println("cd1 < cd2");
		else
				System.out.println("cd1 < cd2");
		
		if (cd1.compareTo(cd3) == 0)
				System.out.println("cd1 == cd3");
		else
				System.out.println("cd1 != cd3");
	}
}
