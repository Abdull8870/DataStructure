package queue;

import queue.Employee;


public class Main {
	public static void main(String[] args) {
		 Queue q=new Queue(6); 
		    Employee one=new Employee("Abdul", "Rahuman", 1);
	        Employee two=new Employee("Safaith", "Ahamed", 2);
	        Employee three=new Employee("VigneshWar", "Raja", 3);
	        Employee four=new Employee("Thamim", "Hussain", 4);
	        Employee five=new Employee("Jagan", "Vaithiyanathan", 5);
	        Employee six=new Employee("Nithish", "Kumar", 6);
	        Employee seven=new Employee("Ab", "D", 7);
	     q.addToQueue(one);
	     q.addToQueue(two);
	     q.addToQueue(three);
	     q.addToQueue(four);
	     q.addToQueue(five);
//	     q.addToQueue(six);
	     q.removeFromFront();
	     q.removeFromFront(); 
	     q.removeFromFront();
	     q.removeFromFront();
	     q.removeFromFront();
	     q.addToQueue(one);
	     q.printQueue();
	  
	}
	
}
