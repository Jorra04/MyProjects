package OOPpractice;

public class AnimalTester {

	public static void main(String[] args) {
		Animal myAnimal = new Animal("Sable", "German Shepard", 30,4);
		
		System.out.println("Name: "+myAnimal.name);
		System.out.println("Species: "+myAnimal.species);
		System.out.println("Mass: "+myAnimal.weight+ " Kg");
		System.out.println("Number of legs: "+myAnimal.numOfLegs);
		
		System.out.println("===============================================");
	



	}

}
