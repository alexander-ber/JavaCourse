package cw05.oop.com.polymorphism;

public class AnimalApp {

	public static void main(String[] args) {
		
		Dog realDog = new Dog();
		realDog.voice = "Voof!";
		realDog.saySomething();
		realDog.guard();
		
		Animal simpleDog = new Dog();
		simpleDog.voice = "af!";
		simpleDog.saySomething();
		realDog.guard();
		
		//simpleDog.guard(); //Error
		
	}

}
