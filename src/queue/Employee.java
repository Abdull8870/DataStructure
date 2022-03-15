package queue;

public class Employee {
	private String firstName;
	private String lastName;
	private int empNum;


	public Employee(String fName,String lName,int number) {
		this.firstName=fName;
		this.lastName=lName;
		this.empNum=number;
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

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String toString() {
		return this.firstName+" "+this.lastName+" id:"+this.empNum;
	}






}
