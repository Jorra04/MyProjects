package recursiveMethods;

import java.util.*;
public class recursiveMethods {
	List<String> myList = new ArrayList<String>();
	
	public static int recursiveFactorial(int number) {
		if(number < 0) {
			throw new IllegalArgumentException("Factorial cannot be calculated"
					+ "based on a negative number");
		}
		if(number <=1 && number >=0) {
			return 1;
		}
		else {
			return number*recursiveFactorial(number - 1);
		}
	}
	
	public static int min(List<Integer> t) {
		if(t.isEmpty()) {
			throw new IllegalArgumentException();
		}
		Integer first  = t.get(0);
		if(t.size() == 1) {
			return first;
		}
		Integer minInRest = min(t.subList(1, t.size()));
		if(first.compareTo(minInRest) < 0) {
			return first;
		}
		return minInRest;
	}
	public static void minToFront(List<Integer> t) {
		if(t.size() < 2) {
			return;
		}
		recursiveMethods.minToFront(t.subList(1, t.size()));
		Integer first = t.get(0);
		Integer second = t.get(1);
		if(second.compareTo(first) < 0) {
			t.set(0, second);
			t.set(1, first);
		}
	}
	
	public static void selectionSort(List<Integer> t) {
		if(t.size() > 1) {
			recursiveMethods.minToFront(t);
			recursiveMethods.selectionSort(t.subList(1, t.size()));
		}
	}
	
	public static int maxOf(List<Integer> t) {
		if(t.size() == 0) {
			throw new IllegalArgumentException();
		}
		Integer first = t.get(0);
		if(t.size() == 1) {
			return first;
		}
		Integer maxInRest = maxOf(t.subList(1, t.size()));
		if(first.compareTo(maxInRest) > 0) {
			return first;
		}
		return maxInRest;
		
		
	}
	
	
	public static int[] arraySort(int[] a) {
		int[] result = new int[a.length];
		int j = a.length;
		while(j !=0) {
			int maxOf = recursiveMethods.max(a);
			for(int i = 0; i < a.length; i++) {
				if(a[i] == maxOf) {
					result[i] = maxOf;
					a[i] = 0;
				}
				j--;
				
				
			}
			
			
		}
		return result;
		
	}
	public static int max(int[]a) {
		if(a.length == 0) {
			throw new IllegalArgumentException();
		}
		if(a.length == 1) {
			return a[0];
		}
		int max = a[0];
		for(int i = 0; i < a.length; i ++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static int numberOf(List<Integer> t,  int n) {
		if(t.size() == 0){
			return 0;
		}
		if(t.get(0).equals(n)) {
			return 1 + numberOf(t.subList(1, t.size()),n);
		}
		return numberOf(t.subList(1, t.size()), n);
	}
	public static int toDecimal(List<Integer> bits) {
		if(bits.size() == 0) {
			return 0;
		}
		int index = 0;
		int value = 0;
		return toDecimalHelper(index, value, bits)/2;
	}
	public static int toDecimalHelper(int index, int value, List<Integer> bits) {
		if(bits.size() == index) {
			return value;
		}
		value += bits.get(index) * Math.pow(2, bits.size() - index);
		index++;
		return toDecimalHelper(index,value,bits);
	}
	
	
	

	public static void main(String[] args) {
		int []a = {1,5,23,6,6,3,4};
		
		arraySort(a);
		for(int i= 0; i < a.length; i++) {
//			System.out.println(a[i]);
		}
//		minToFront(t);
//		
//		System.out.println(t);
//		System.out.println(recursiveMethods.numberOf(t, 6));
//		System.out.println(recursiveMethods.max(a));
		
		
		Integer []a1 = {1,0,0,0};
		List<Integer> t1 =  Arrays.asList(a1);
		Integer []a2 = {1,0,1,0};
		List<Integer> t2 =  Arrays.asList(a2);
		Integer []a3 = {0,1,0,1};
		List<Integer> t3 =  Arrays.asList(a3);
		Integer []a4 = {1,0,0,1};
		List<Integer> t4 =  Arrays.asList(a4);
		Integer []a5 = {1,1,1,0};
		List<Integer> t5 =  Arrays.asList(a5);
		Integer []a6 = {0,0,0,0};
		List<Integer> t6 =  Arrays.asList(a6);
		Integer []a7 = {1,0,1,1};
		List<Integer> t7 =  Arrays.asList(a7);
		Integer []a8 = {1,1,1,1};
		List<Integer> t8 =  Arrays.asList(a8);
		System.out.println(recursiveMethods.toDecimal(t1));
		System.out.println(recursiveMethods.toDecimal(t2));
		System.out.println(recursiveMethods.toDecimal(t3));
		System.out.println(recursiveMethods.toDecimal(t4));
		System.out.println(recursiveMethods.toDecimal(t5));
		System.out.println(recursiveMethods.toDecimal(t6));
		System.out.println(recursiveMethods.toDecimal(t7));
		System.out.println(recursiveMethods.toDecimal(t8));
		
	}

}
