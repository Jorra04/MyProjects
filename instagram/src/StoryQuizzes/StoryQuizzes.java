package StoryQuizzes;
import java.util.*;
import java.util.stream.Collectors;
public class StoryQuizzes {
	public static void main(String[] args) {
		float myFloat = 5.0f;
		double myDouble = (byte)(int) myFloat;
		
		List<Integer> square = new ArrayList();
		square.add(5);
		square.add(7);
		List<Integer> list = square.stream().map(x->x*x)
		.collect(Collectors.toList());
		
		
		
		System.out.println(list);

	}
}
