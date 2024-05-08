package abstractClass;

public class AnimalExample {
	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------");

		// ������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog(); // animal Ÿ���� ������ new Dog() �����Ͽ� ��ü ����
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----------");

		// �Ű������� �ڵ� Ÿ�� ��ȯ
		animalSound(new Dog()); // animal Ÿ���� �Ű�����, ���� ��ü�� ����
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound(); // ���޵� ��ü�� sound() �޼ҵ� ȣ��
	}
}
