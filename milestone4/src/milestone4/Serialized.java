package milestone4;

import java.io.Serializable;

public class Serialized implements Serializable {
	String firstName;
	String lastName;
	int employeeId;
	double salary;

	public Serialized(String firstName, String lastName, int employeeId, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", salary="
				+ salary;
	}

}
