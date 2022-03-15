package map;

import map.Employee;

public class Main {
	
	
public static void main(String[] args) {
	  Employee one=new Employee("Abdul", "Rahuman", 1);
      Employee two=new Employee("Safaith", "Ahamed", 2);
      Employee three=new Employee("VigneshWar", "Raja", 3);
      Employee four=new Employee("Thamim", "Hussain", 4);
      Employee five=new Employee("Jagan", "Vaithiyanathan", 5);
      Employee six=new Employee("Nithish", "Kumar", 6);
      Employee seven=new Employee("Ab", "D", 7);
      LinkedHashMap map=new LinkedHashMap();
      map.put("Abdul", one);
      map.put("safaaith", two);
      map.put("vicky", three);
      map.put("thamim", four);
      map.put("jagan", five);
      map.put("nithish", six);
      map.put("ab", seven);
      map.printTable();
}
}
