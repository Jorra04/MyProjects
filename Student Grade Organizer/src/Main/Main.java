package Main;
import java.io.FileWriter;
import java.io.IOException;
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
		
		
		class1.saveData();
		
//		try {
//		      FileWriter myWriter = new FileWriter("C:\\Users\\jorra\\OneDrive\\Desktop\\student records.txt");
//		      String text = "========================= Student Data ==============================\n"
//		      		+ class1.toString()
//		    		  +"\n========================= Top Student in Class ==============================\n"
//		      		+ class1.getTopStudent().toString() 
//		      		+ "\n======================== Top K students ================================\n"
//		      		+class1.getTopKStudents(3)
//		      		+"\n======================== Weakest Student in Class ===========================\n"
//		      		+class1.getWeakestStudent();
//		      myWriter.write(text);
//		      myWriter.close();
//		      System.out.println("Successfully wrote to the file.");
//		    } catch (IOException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
		
//		System.out.println(class1.toString());
//		
//		System.out.println("========================= Top Student in Class ==============================");
//		
//		System.out.println(class1.getTopStudent().toString());
//		
//		
//		System.out.println("======================== Top K students ================================");
//		
//		System.out.println(class1.getTopKStudents(3));
//		
//		System.out.println("======================== Weakest Student in Class ===========================");
//		
//		System.out.println(class1.getWeakestStudent());
		

	}

}
