package chap08.section03.quiz01;

public class AnimalApplication {
	public static void main(String[] args) {
		Animal animal = new Lion();
		animal.sound(); // 크렁
		animal = new Tiger();
		animal.sound(); // 어흥
	}

}
