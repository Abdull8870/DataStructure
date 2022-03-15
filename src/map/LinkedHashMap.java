package map;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedHashMap implements Map{

	public LinkedList<StoreEmployee> hashMap[];
	
	
	public LinkedHashMap() {
		
		hashMap=new LinkedList[10];
		for(int i=0;i<10;i++) {
			hashMap[i]=new LinkedList<StoreEmployee>();
		}
	}
	@Override
	public Employee put(String key, Employee emp) {
		int hashedKey=hashKey(key);
	    hashMap[hashedKey].add(new StoreEmployee(key, emp));
		return emp;
		
	}

	@Override
	public Employee remove(String key) {
		int hashedKey=hashKey(key);
	    ListIterator<StoreEmployee> itr=hashMap[hashedKey].listIterator();
	    int index=-1;
	    StoreEmployee emp=null;
	    while(itr.hasNext()) {
	       emp = itr.next();
	       index++;
	       if(emp.key.equals(key)) {
	    	   break;
	       }
	    }
	    if(emp==null) {
	    	return null;
	    } else {
	    	
	    Employee employee=hashMap[hashedKey].get(index).emp;
	    hashMap[hashedKey].remove(index);
		return employee;
		}
	}

	@Override
	public int hashKey(String key) {
		
		return key.length()%hashMap.length;
	}

	@Override
	public int findKey(String key) {
		int hashedKey=hashKey(key);
		
		
		
		return 0;
	}

	@Override
	public void printTable() {
		for(int i=0;i<hashMap.length;i++) {
			if(hashMap[i]==null) {
				continue;
			} else {
			for(StoreEmployee emp:hashMap[i]) {
				System.out.println("Key->"+emp.key+"\nEmployee details"+emp.emp);
			}
		}
			}
		
	}

}
