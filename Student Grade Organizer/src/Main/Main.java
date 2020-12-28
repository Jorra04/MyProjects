package Main;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		
		List<Student> students = new ArrayList();
		List<Student> outputStudents = new ArrayList();
		
		Professor professor1 = new Professor(Credentials.fname, Credentials.lname, Credentials.age, Credentials.faculty );
		Course course = new Course(Credentials.courseName,Credentials.courseCode ,professor1);
		
		Student s1 = new Student(Credentials.studentGPA1 ,Credentials.studentName1,Credentials.studentID1 );
		Student s2 = new Student(Credentials.studentGPA2 ,Credentials.studentName2,Credentials.studentID2 );
		Student s3 = new Student(Credentials.studentGPA3 ,Credentials.studentName3,Credentials.studentID3 );
		Student s4 = new Student(Credentials.studentGPA4 ,Credentials.studentName4,Credentials.studentID4 );
		Student s5 = new Student(Credentials.studentGPA5 ,Credentials.studentName5,Credentials.studentID5 );
		
		ClassInformation class1 = new ClassInformation(course, professor1);
		class1.addStudent(s1);
		class1.addStudent(s2);
		class1.addStudent(s3);
		class1.addStudent(s4);
		class1.addStudent(s5);
		
		
		class1.saveData();
		

	}

}
