package tables;

import tables.Employee;

public class Main {

	public static void main(String[] args) {
		System.out.println(-2/-2);
		    Employee one=new Employee("Abdul", "Rahuman", 1);
	        Employee two=new Employee("Safaith", "Ahamed", 2);
	        Employee three=new Employee("VigneshWar", "Raja", 3);
	        Employee four=new Employee("Thamim", "Hussain", 4);
	        Employee five=new Employee("Jagan", "Vaithiyanathan", 5);
	        Employee six=new Employee("Nithish", "Kumar", 6);
	        HashTable map=new HashTable();
	        map.put("abdul",one);
	        map.put("safaaith",two);
	        map.put("raja",three);
	        map.put("thamim",four);
	        map.put("jagan",five);
	        map.put("nithish",six);
//	        map.put("nithish",six);
//	        
	    
	        map.printHashTable();
	        Employee employee = map.get("jagan");
	        System.out.println("\n\n\n"+employee);
	        map.remove("jagan");
	        Employee employee1 = map.get("jagan");
	        System.out.println("\n\n\n"+employee1);
	        map.put("jagan",five);
	        Employee employee2 = map.get("jagan");
	        System.out.println("\n\n\n"+employee2);
	}
}
