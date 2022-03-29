package milestone3;

public class Employee {
	private String firstName;
	private int employeeId;
	private double salary;
	private String lastName;
	
	public Employee(String firstName , String lastName, int employeeId, double salary) {
		super();
		this.firstName = firstName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName  + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
}
