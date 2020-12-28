package Main;

public class Course {
	
	private String courseName;
	private String courseID;
	private Professor professor;
	
	
	public Course(String courseName, String courseID, Professor professor) {
		this.courseName = courseName;
		this.courseID = courseID;
		this.professor = professor;
	}
	
	public Course(Course other) {
		this.courseName = other.courseName;
		this.courseID = other.courseID;
		this.professor = other.professor;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public String getCourseID() {
		return this.courseID;
	}
	
	public Professor getCourseInstructor() {
		return this.professor;
	}
	
	public String toString() {
		return "Course Name: " + this.courseName +"\nCourse ID: " +  this.courseID + "\nProfessor: "+ this.professor;
	}
}
