
public class Employee {
	private static int employeeNumber = 0;
	private String name;
	private String role;
	private int id;
	
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
		this.id = ++employeeNumber;
	}
	
	public String getEmployeeName(Employee employee) {
		return employee.name;
	}
	
	public void updateEmployeeName(String name) {
		this.name = name;
	}
	
	public void setEmployeeRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		return Employee.employeeNumber + " " + this.name + " " + this.role;
	}
	
}
