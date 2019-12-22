package OOPpractice2;

public class personTester {

	public static void main(String[] args) {
		person p1 = new person("Jorra", 189,90,20,"blk");
		person p2 = new person("inder", 188,60,18,"blk");
		System.out.println("=================(1)");
		String p1Hair = p1.hairColour;
		String p2Hair = p2.hairColour;
		
		System.out.println(p1.name + " has hair colour: " + p1.hairColour);
		System.out.println(p1.name+ " and " + p2.name + " have the same hair colour: "
		+ p1Hair==p2Hair);
		
		System.out.println(p1.name + " weighs more than " + p2.name + 
				": "+p1.weighsMoreThan(p2));

	}

}
