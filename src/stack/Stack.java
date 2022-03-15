package stack;

import java.util.LinkedList;

public class Stack {

	 private LinkedList<Employee> stack;
	 
	 public Stack() {
		 stack =new LinkedList<Employee>();
	 }
	 
	 public void push(Employee emp) {
		 stack.push(emp);
	 }
	 
	 public void pop() {
		 stack.pop();
	 }
	 
	 public void peek() {
		 System.out.println(stack.peek());
	 }
	 
	 
}
