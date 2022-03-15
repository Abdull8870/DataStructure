package practise;

public class Main <T extends Animal & Common>{

	T o;
	 
	 public Main(T value){
		 this.o=value;
		 }
	 
	 public void print() {
		 this.o.animalName();
	 }
	 
	 

	
	public static void main(String[] args) {
//		Main<Dog> m=new Main<Dog>(new Dog());
	    Main<Dog> m=new Main<Dog>(new Dog());
	    m.print();
	    Main<Cat> n=new Main<Cat>(new Cat());
	    n.print();
		
	}
}

