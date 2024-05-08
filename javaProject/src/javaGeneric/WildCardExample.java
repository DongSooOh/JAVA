package javaGeneric;

import java.util.Arrays;

/*
	���׸� Ÿ�� <?>: Unbounded Wildcards(���� ����)
 	 �� Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ '���' Ŭ������ �������̽� Ÿ���� �� �� �ִ�.
	���׸� Ÿ�� <? extends ���� Ÿ��>: Upper Bounded Wildcards(���� Ŭ���� ����)
 	 �� Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���� �������� '���� Ÿ��'(���� Ÿ�� ����)�� �� �� �ִ�.
	���׸� Ÿ�� <? super ���� Ÿ��>: Lower Bounded Wildcards(���� Ŭ���� ����)
 	 �� Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���� �������� '���� Ÿ��'(���� Ÿ�� ����)�� �� �� �ִ�.  
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
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
			personCourse.add(new Person("�Ϲ���"));
			personCourse.add(new Worker("������"));
			personCourse.add(new Student("�л�"));
			personCourse.add(new HighStudent("����л�"));

		Course<Worker> workerCourse = new Course<Worker>("������ ����", 5);
			workerCourse.add(new Worker("������"));

		Course<Student> studentCourse = new Course<Student>("�л� ����", 5);
			studentCourse.add(new Student("�л�"));
			studentCourse.add(new Student("����л�"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л� ����", 5);
			highStudentCourse.add(new HighStudent("����л�"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();

		// registerCourseStudent(personCourse); // extends�� ���� Ÿ���� ȣ���� �� ����
		// registerCourseStudent(workerCourse); // ��Ӱ��谡 �ƴ϶� ȣ�� ����
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse); // extends�� ���� Ÿ�� ȣ���� ����
		System.out.println();

		registerCourseWorker(personCourse); // super�� ���� Ÿ�� ȣ���� ����
		registerCourseWorker(workerCourse);
		// registerCouresWorker(studentCourse); // ��Ӱ��谡 �ƴ϶� ȣ�� ����
		// registerCourseWorker(highStudentCourse); // ��� ���谡 �ƴ϶� ȣ�� ����
	}
}
