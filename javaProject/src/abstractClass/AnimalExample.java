package abstractClass;

public class AnimalExample {
	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------");

		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog(); // animal 타입의 변수에 new Dog() 대입하여 객체 생성
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----------");

		// 매개변수의 자동 타입 변환
		animalSound(new Dog()); // animal 타입의 매개변수, 동물 객체를 전달
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound(); // 전달된 객체의 sound() 메소드 호출
	}
}
