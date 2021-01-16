package Recursion;

public class Recursion {
	public static void main(String[] args) {
//		System.out.println(fib(7));
			System.out.println(rec(2));
	}
	
	public static int fib(int n) {
		if(n == 0) return 0;
		
		if(n == 1) return 1;
		
		return fib(n-1) + fib(n-2);
	}
	
	public static int rec(int n) {
		
		if(n == 4) return n;
		
		return 2 * rec(n+1);
	}
}
