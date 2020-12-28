package Main;
import java.util.*;
public class ClassInformation {
	
	private int cumulativeGradePoints;
	private List<Student> students;
	private double classAverage;
	private int classSize;
	
	public ClassInformation() {
		this.students  = new ArrayList();
		this.classAverage = 0;
		this.classSize = 0;
		this.cumulativeGradePoints = 0;
	}
	
	public ClassInformation(ClassInformation other) {
		this.students = other.students;
		this.classAverage = other.classAverage;
		this.classSize = other.classSize;
		this.cumulativeGradePoints = other.cumulativeGradePoints;
	}
	
	
	public List<Student> getStudents(){
		return this.students;
	}
	
	public Student getTopStudent() {
		return this.students.get(0);
	}
	
	public List<Student> getTopKStudents(int k){
		if(k > this.classSize || k < 1) {
			throw new IllegalArgumentException("Please provide a valid range.");
		}
		List<Student> outputList = new ArrayList();
		for(int i = 0; i <= k; i ++) {
			outputList.add(this.students.get(i));
		}
		
		return outputList;
	}
	
	public double getCimulativeGPA() {
		return this.classAverage;
	}
	
	public int getClassSize() {
		return this.classSize;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
		this.classSize ++;
		this.cumulativeGradePoints += student.getGPA();
		this.classAverage = this.cumulativeGradePoints / (1.0 *this.classSize);
		
		Collections.sort(this.students, new StudentComparator());
	}

	
	public String toString() {
		return "Class Average: " + this.classAverage + " Class Size: " + this.classSize +"\n\n\n" + this.students;
	}
	
}
