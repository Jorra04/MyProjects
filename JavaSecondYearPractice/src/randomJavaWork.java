import java.util.*;
public class randomJavaWork {
	

	
	
	
	
	

	public static void main(String[] args) {
		ArrayList<Date> date1 = new ArrayList<>();
		Date d1 = new Date(110,02,14, 8,30);
		Date d2 = new Date(111,0,2, 8,30);
		Date d3 = new Date(115,1,23, 8,30);
		Date d4 = new Date(117,8,21, 8,30);
		date1.add(d1);
		date1.add(d2);
		date1.add(d3);
		date1.add(d4);
		
		ArrayList<Date> shallowCopyDate = new ArrayList<>(date1);
		
		
		ArrayList<Date> deepCopyDate = new ArrayList<>();
		
		for(Date date : date1) {
//			deepCopyDate.add(new Date(date));
		}
		
		
		System.out.println(date1);
		System.out.println(shallowCopyDate);
		System.out.println(date1 == shallowCopyDate);
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);
//		System.out.println(d4);
		String h = "this is a practice";
		h = h.replaceAll("\\s","");
		System.out.println(h);
		

	}

}
