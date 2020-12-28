package Main;
import java.util.*;
public class Student {
	private int GPA;
	private String name;
	private String UID;
	private List<Course> entrolledCourses; //can go through the list of courses and update gpa
	
	public Student(int GPA, String name, String UID) {
		this.GPA = GPA;
		this.name = name;
		this.UID = UID;
	}
	
	public int getGPA() {
		return this.GPA;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getUID() {
		return this.UID;
	}
	
	public void setGPA(int gpa) {
		this.GPA = gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nUID: "+ this.UID  + "\nGrade: " + this.GPA + "\n";
	}
	
	




	
	
}
