package map;

public interface Map {
	
	public Employee put(String key,Employee emp);
	
	public Employee remove(String key);
	
	public int hashKey(String key);
	
	public int findKey(String key);
	
	public void printTable();

}
