package p07.textbook.s070804;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------------");
		
		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("---------------");

		// 메소드의 다형성
		AnimalExample animal1 = new AnimalExample();
		animal1.animalSound(new Dog());
		animal1.animalSound(new Cat());
	}
	
	public void animalSound(Animal animal) {
		
		animal.sound();
	}
}
