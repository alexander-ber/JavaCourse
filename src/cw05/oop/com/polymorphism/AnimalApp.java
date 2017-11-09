package cw05.oop.com.polymorphism;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog realDog = new Dog();
		realDog.setVoice("Voaff!!");
		realDog.saySomething();
		realDog.guard();
		
		Animal simpleDog = new Dog();
		simpleDog.setVoice("af!!");
		simpleDog.saySomething();
		
		//simpleDog.guard(); //Error
		
	}

}
