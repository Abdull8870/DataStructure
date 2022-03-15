package map;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int empNumber;
	
	public Employee(String firstName, String lastName, int empNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empNumber = empNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	
	public String toString() {
		return "First Name: "+this.firstName+"\nLast Name: "+this.lastName+
	"\nEmployee Id: "+this.empNumber;
	}
	
	

}
