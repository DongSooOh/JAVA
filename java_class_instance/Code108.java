package class7;

class Student1{
	static int numberOfStudent1;
	String name;
	double score;
	
	Student1(){
		numberOfStudent1 ++;
	}
	
	Student1(String n, double s){
		numberOfStudent1 ++;
		name = n;
		score = s;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		System.out.println("numberOfStudent1 : " + numberOfStudent1);
	}
}

public class Code108 {

	public static void main(String[] args) 
	{
		Student1 s1 = new Student1("Alice", 90.5);
		Student1 s2 = new Student1("David", 88.3);
		Student1 s3 = new Student1("Cindy", 77.1);
		
		s1.print();
		s2.print();
		s3.print();
		

	}

}
