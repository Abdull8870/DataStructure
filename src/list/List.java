package list;

public class List {

	private ListNode head;
	private int size;
	
	public int getSize() {
		return size;
	}

	public void addToFront(Employee emp) {
		ListNode node=new ListNode(emp);
		node.setNext(head);
		size++;
		head=node;
	}
	
	public Employee removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		ListNode remove=head;
		head=head.getNext();
		remove.setNext(null);
		size--;
		return remove.getEmp();
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void printList() {
		ListNode current=head;
		System.out.println("Head--->");
		while(current!=null) {
			System.out.println(current.getEmp());
			current=current.getNext();
		}
		System.out.println("---Null");
	}
}
