package list;

public class ListNode {
private Employee emp;
private ListNode next;

public ListNode(Employee emp) {
	this.emp=emp;
}

public Employee getEmp() {
	return emp;
}
public void setEmp(Employee emp) {
	this.emp = emp;
}
public ListNode getNext() {
	return next;
}
public void setNext(ListNode next) {
	this.next = next;
}

}
