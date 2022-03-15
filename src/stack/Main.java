package stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack stack =new Stack();
        Employee one=new Employee("Abdul", "Rahuman", 1);
        Employee two=new Employee("Abdul", "Rahuman", 2);
        Employee three=new Employee("Abdul", "Rahuman", 3);
        Employee four=new Employee("Abdul", "Rahuman", 4);
        Employee five=new Employee("Abdul", "Rahuman", 5);
        Employee six=new Employee("Abdul", "Rahuman", 6);
        stack.push(one);
        stack.push(two);
        stack.push(three);
        stack.push(four);
        stack.push(five);
        stack.push(six);
        stack.peek();
        
        
	}

}
