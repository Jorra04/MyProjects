package LambdaExpressions;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		for(int i = 1; i <= 10; i ++) {
			list.add(i);
		}
		list.forEach(n ->{
			if(n % 2 == 0) {
				System.out.println(n);
			}
		});
		
	}

}
