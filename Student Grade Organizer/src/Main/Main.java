package Main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		
		List<Student> students = new ArrayList();
		List<Student> outputStudents = new ArrayList();
		Student s1 = new Student(9 ,"Jorra Singh","12345" );
		Student s2 = new Student(7 ,"Indermohan Gill","12346" );
		Student s3 = new Student(5 ,"Daniel Din","12347" );
		Student s4 = new Student(6 ,"Fabian Cojman","12348" );
		Student s5 = new Student(5 ,"Bao Ho","12349" );
		
		ClassInformation class1 = new ClassInformation();
		class1.addStudent(s1);
		class1.addStudent(s2);
		class1.addStudent(s3);
		class1.addStudent(s4);
		class1.addStudent(s5);
		
		System.out.println(class1.toString());
		
		System.out.println("===============================================================");
		
		System.out.println(class1.getTopStudent().toString());
		
		
		System.out.println("===============================================================");
		
		System.out.println(class1.getTopKStudents(3));
		
		
//		students.add(s1);
//		students.add(s2);
//		students.add(s3);
//		students.add(s4);
//		students.add(s5);
	
		
		
//		PriorityQueue<Student> pleaseWork = new PriorityQueue<>(new StudentComparator());
//		
//		for(Student student : students) {
//			pleaseWork.offer(student);
//		}
//		
//		while(!pleaseWork.isEmpty()) {
//			outputStudents.add(pleaseWork.poll());
//		}
//		
//		
//		System.out.println(students.toString());
//
//		System.out.println(outputStudents.toString());
	}

}
