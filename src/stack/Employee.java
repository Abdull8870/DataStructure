package stack;

public class Employee {

	private String fristName;
	private String lastName;
	private int employeeNumber;
	
	public Employee(String firstName,String lastName,int employeeNumber) {
		this.fristName=firstName;
		this.lastName=lastName;
		this.employeeNumber=employeeNumber;
	}
	
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	 
	public String toString() {
		return this.fristName+" "+this.lastName+" \n id= "+this.employeeNumber;
	}
	
}
