package heaps;

public class Main {
public static void main(String[] args) {
	Heap hp=new Heap(5);
	hp.insert(10);
	hp.insert(12);
	hp.insert(13);
	hp.insert(9);
	hp.insert(122);
	hp.printHeap();
//	hp.delete(0);
//	hp.printHeap();
	hp.delete(0);
	System.out.println("\n\n");
	hp.printHeap();
}
}