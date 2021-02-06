package PassByValue;

public class main {

	public static void main(String[] args) {
		Person p1 = new Person("Jeff");
		System.out.println(p1.name.equals("Jeff"));
		ChangeName(p1);
		System.out.println(p1.name.equals("Jeff"));
		
		

	}
	
	public static void ChangeName(Person p) {
		p =  new Person("troy");
	}

}
