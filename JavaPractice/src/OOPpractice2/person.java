package OOPpractice2;

public class person {
	String name;
	double height;
	double weight;
	int age;
	String hairColour;
	
	
	person(String name, double height, double weight, int age, String hairColour){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.hairColour = hairColour;
	}
	
	
	int getAge() {
		return this.age;
	}
	
	boolean weighsMoreThan(person other) {
		boolean tf = false;
		if(weight > other.weight) {
			tf = true;
		}
		else {
			tf = false;
		}
		return tf;
	}

	
}