package AggregationPractice;
import java.util.*;

public class Person {
	
	private String name;
	private Date birthDate;
	
	
	public Person(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	public String getName() {
		return this.name;
	}
	
	public Date getBirthDate() {
		return this.birthDate;
	}

}
