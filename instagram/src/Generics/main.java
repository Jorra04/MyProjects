package Generics;

public class main {

	public static void main(String[] args) {
//		Generic g = new Generic<String>("Five");
//		Generic g2 = new Generic<Integer>(5);
//		System.out.println(g.getData());
//		System.out.println(g2.getData());
		StringBuilder s = new StringBuilder("67498");
		StringBuilder s2 = new StringBuilder("67498");
		System.out.println(s.compareTo(s2));
		
	}
	
	public static void change(StringBuilder s) {
		s.append("a");
	}

}
