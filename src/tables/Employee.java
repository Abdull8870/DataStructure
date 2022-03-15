package tables;

public class Employee {
   private String firstName;
   private String lastName;
   private int empNumber;
   
   public Employee(String fName,String lName,int empNum) {
	   this.firstName=fName;
	   this.lastName=lName;
	   this.empNumber=empNum;
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
	return "First Name: "+this.firstName+"\nLast Name: "+this.lastName
			+"\nEmployee Number: "+this.empNumber;
}
   
}
