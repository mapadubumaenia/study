package chap08.section03.example01;

public class AnimalApplication {
public static void main(String[] args) {
	Animal animal=new Dog();
	animal.sound();
	animal=new Cat();
	animal.sound();
}
}
