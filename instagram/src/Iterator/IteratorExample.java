package Iterator;
import java.util.*;
public class IteratorExample {
	public static void main(String[] args) {
		List<String> strings = new ArrayList();
		strings.add("foo");
		strings.add("bar");
		Iterator<String> it = strings.iterator();
		while(it.hasNext()) {
			if(it.next().equals("foo")) {
				it.remove();
			}
		}
		System.out.println(strings);
	}
}
