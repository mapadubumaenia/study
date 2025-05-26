package chap09.quiz10;

public class AnimalApplication {
	public static void main(String[] args) {

		Animal animal = new Cat(); // 다형성
		animal.crying(); // 야옹!!
		animal = new Chicken();
		animal.crying(); // 꼬끼오!!!
		animal = new Cow();
		animal.crying(); // 음메!!!
		animal = new Dog();
		animal.crying(); // 멍멍!!!
		animal = new Mouse();
		animal.crying(); // 찍찍!!!

	}
}
