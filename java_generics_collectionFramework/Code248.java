package java14;

import java.util.HashSet;

class Person4 {
	String name;
	int age;
	Person4(String name, int age){
			this.name = name;
			this.age = age;
	}
	public String toString() {
			return name + ":" + age;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Person4) {
				Person4 tmp = (Person4)obj;
				return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	public int hashCode() {
			return name.hashCode() + age;
	}
}

public class Code248 {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		set.add(new String("Alice"));
		set.add(new String("Alice"));
		set.add(new Person4("Robert", 10));
		set.add(new Person4("Robert", 10));
		System.out.println(set);
	}
}
