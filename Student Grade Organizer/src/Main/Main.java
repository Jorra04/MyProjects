package Main;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		
		List<Course> courses = new ArrayList();
		
		Professor professor1 = new Professor(Credentials.fname, Credentials.lname, Credentials.age, Credentials.faculty );
		Course course1 = new Course(Credentials.courseName,Credentials.courseCode ,professor1);
		
		Student s1 = new Student(Credentials.studentGPA1 ,Credentials.studentName1,Credentials.studentID1 );
		Student s2 = new Student(Credentials.studentGPA2 ,Credentials.studentName2,Credentials.studentID2 );
		Student s3 = new Student(Credentials.studentGPA3 ,Credentials.studentName3,Credentials.studentID3 );
		Student s4 = new Student(Credentials.studentGPA4 ,Credentials.studentName4,Credentials.studentID4 );
		Student s5 = new Student(Credentials.studentGPA5 ,Credentials.studentName5,Credentials.studentID5 );
		
		
		course1.addStudent(s1);
		course1.addStudent(s2);
		course1.addStudent(s3);
		course1.addStudent(s4);
		course1.addStudent(s5);
		
		courses.add(course1);
		
		School school = new School(courses);
		school.saveData();
		

	}

}
