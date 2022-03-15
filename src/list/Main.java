package list;

import list.Employee;

public class Main {

	public static void main(String[] args) {
		List linkedList=new List();
		 Employee one=new Employee("Abdul", "Rahuman", 1);
	        Employee two=new Employee("Safaith", "Ahamed", 2);
	        Employee three=new Employee("VigneshWar", "Raja", 3);
	        Employee four=new Employee("Thamim", "Hussain", 4);
	        Employee five=new Employee("Jagan", "Vaithiyanathan", 5);
	        Employee six=new Employee("Nithish", "Kumar", 6);
	        linkedList.addToFront(one);
	        linkedList.addToFront(two);
	        linkedList.addToFront(three);
	        linkedList.addToFront(four);
	        linkedList.addToFront(five);
	        linkedList.addToFront(six);
	        linkedList.printList();
	        linkedList.removeFromFront();
	        linkedList.printList();
	        linkedList.addToFront(new Employee("Abdul", "Alihussein", 12));
	        linkedList.printList();
	        System.out.println(linkedList.getSize());
	}
}
