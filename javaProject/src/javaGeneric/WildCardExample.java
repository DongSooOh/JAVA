package javaGeneric;

import java.util.Arrays;

/*
	제네릭 타입 <?>: Unbounded Wildcards(제한 없음)
 	 → 타입 파라미터를 대치하는 구체적인 타입으로 '모든' 클래스나 인터페이스 타입이 올 수 있다.
	제네릭 타입 <? extends 상위 타입>: Upper Bounded Wildcards(상위 클래스 제한)
 	 → 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입을 기준으로 '하위 타입'(기준 타입 포함)이 올 수 있다.
	제네릭 타입 <? super 하위 타입>: Lower Bounded Wildcards(하위 클래스 제한)
 	 → 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입을 기준으로 '상위 타입'(기준 타입 포함)이 올 수 있다.  
*/	

class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}

class HighStudent extends Student {
	public HighStudent(String name) {
		super(name);
	}
}

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}
}

class Student extends Person {
	public Student(String name) {
		super(name);
	}
}

class Worker extends Person {
	public Worker(String name) {
		super(name);
	}
}

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Student("학생"));
			personCourse.add(new HighStudent("고등학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
			workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
			studentCourse.add(new Student("학생"));
			studentCourse.add(new Student("고등학생"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
			highStudentCourse.add(new HighStudent("고등학생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();

		// registerCourseStudent(personCourse); // extends로 상위 타입을 호출할 수 없음
		// registerCourseStudent(workerCourse); // 상속관계가 아니라 호출 제한
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse); // extends로 하위 타입 호출이 가능
		System.out.println();

		registerCourseWorker(personCourse); // super로 상위 타입 호출이 가능
		registerCourseWorker(workerCourse);
		// registerCouresWorker(studentCourse); // 상속관계가 아니라 호출 제한
		// registerCourseWorker(highStudentCourse); // 상속 관계가 아니라 호출 제한
	}
}
