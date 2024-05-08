package class7;

class Student2{
	private String name;
	private int score;
	
	Student2(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
	void print() {
		System.out.println(name + "(" + score + ")");
	}
}
public class Code125 {

	public static void main(String[] args) 
	{
		Student2 st[] = new Student2[5]; // 배열 선언
		st[0] = new Student2("Alice", 88); // 배열 초기화
		st[1] = new Student2("Tom", 98);
		st[2] = new Student2("Jenny", 80);
		st[3] = new Student2("Betty", 79);
		st[4] = new Student2("Daniel", 91);
		
		
		int total = 0;
		for (int i = 0; i < st.length; i++)
			total += st[i].getScore();
		
		/* 위의 for루프( ; ; )는 아래와 같이 for-each 구문으로 변경 가능
		  
		   int total = 0;
		   for (Student2 s : st)
		   total += s.getScore();
		   
		*/
		double average = (double) total / st.length;
		
		System.out.println("average : " + average);
	}

}
