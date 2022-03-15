package tables;

public class HashTable {
 private StoreEmployee[] hashTable;
 
 public HashTable() {
	 hashTable=new StoreEmployee[6];
 }
 
 public Employee put(String key,Employee value) {
	 int hashedValue=hashKey(key);
	 if(occupied(hashedValue)) {
		 int stopIndex=hashedValue;
		 if(hashedValue==hashTable.length-1) {
			 hashedValue=0;
		 } else {
			 hashedValue++;
		 }
		 while(occupied(hashedValue) && hashedValue!=stopIndex) {
			 hashedValue= (hashedValue+1) % hashTable.length;
		 }	 
	 }
	 if(hashTable[hashedValue]!=null) {
		 System.out.println("Sorry there's already an Employee");
	 } else {
		 hashTable[hashedValue]=new StoreEmployee(key, value);
	 }
	 return value;
 }
 
 public Employee get(String key) {
	 int hashedValue=find(key);
	 if(hashedValue>=0) {
		 return hashTable[hashedValue].emp;
	 } else {
		 return null;
	 }
	 
 }
 
 public int find(String key) {
	 int hashedValue=hashKey(key);
	
	 
	 if(hashTable[hashedValue] !=null && hashTable[hashedValue].key.equals(key)) {
		 return hashedValue;
	 } 
       int stopIndex=hashedValue;
	   if(hashedValue==hashTable.length-1) {
			 hashedValue=0; 
	 } else {
		 hashedValue++;
	 }
	   
	   while(hashTable[hashedValue]!=null && !hashTable[hashedValue].key.equals(key) &&
			   hashedValue!=stopIndex) {
		   hashedValue= (hashedValue+1)%hashTable.length;
	   }
	   
	   if(hashTable[hashedValue]!=null && hashTable[hashedValue].key==key ) {
		   return hashedValue;
	   } else {
		   return -1;
	   }
 }
 
 public Employee remove(String key) {
	 int hashedValue=find(key);
	 if(hashedValue==-1) {
		 return null;
	 } else if (hashTable[hashedValue].key.equals(key)) {
		 Employee emp=hashTable[hashedValue].emp;
		 hashTable[hashedValue]=null;
		 StoreEmployee[] oldTable=hashTable;
		 hashTable=new StoreEmployee[oldTable.length];
		 for(int i=0;i<oldTable.length;i++) {
			 if(oldTable[i]!=null) {
				 put(oldTable[i].key, oldTable[i].emp);
			}
		 }
		 return emp;
	 }
	 return null;
	 
 }
 
 public void printHashTable() {
	 
	 
	 for(int i=0;i<hashTable.length;i++) {
		 if(hashTable[i]==null) {
			 System.out.println("Empty");
		 }else {
		 System.out.println(hashTable[i].emp);
	 }
		 }
 }
 
 public boolean occupied(int key) {
	 return hashTable[key]!=null;
 }
 
 private int hashKey(String key) {
	
	 return key.length() % hashTable.length;
 }
}
