package java16;

enum Cards{
	HEART, CLUB, SPADE, DIAMOND
}

public class Code269 {
	public static void main(String[] args) {
		Cards cd;
		cd = Cards.DIAMOND;
		System.out.println("Value of cd : " + cd);
		
		cd = Cards.SPADE;
		
		if (cd == Cards.SPADE)
			System.out.println("cd is SPADE.");
		
		switch(cd) {
		case HEART:
				System.out.println("Heart card");
				break;
		case CLUB:
				System.out.println("Club card");
				break;
		case SPADE:
				System.out.println("Spade card");
				break;
		case DIAMOND:
				System.out.println("Diamond card");
				break;
		}
	}
}