package inheritance;

public class main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal dog1 = new Dog();
		Animal animal = new Animal();
		dog.eat();
		dog1.eat();
		animal.eat();
		Animal german_shep = new GermanShepard();
		german_shep.eat();
	}

}
