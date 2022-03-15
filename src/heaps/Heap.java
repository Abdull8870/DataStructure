package heaps;

public class Heap {
	private int[] heap;
	private int size;
	
	public Heap(int capacity) {
		heap=new int[capacity];
	}
	
	public void insert(int value) {
		if(isFull()) {
			throw new ArrayIndexOutOfBoundsException("Heap is full");
		} else {
			heap[size]=value;
			fixHeapAbove(size);
			size++;
		}
	}
	
	public void delete(int index) {
		
		if(size==0) {
			throw new IndexOutOfBoundsException("No elements");
		}
		int deltetdValue=heap[index];
		heap[index]=heap[size-1];
		
		if(index==0 || heap[index]<heap[getParent(index)]) {
			fixHeapBelow(index, size-1);
		} else {
			fixHeapAbove(index);
		}
		
		size=size-1;
	}
	
	public void fixHeapAbove(int index) {
		int newValue=heap[index];
		while(index>0 && newValue > heap[getParent(index)]) {
			heap[index]=heap[getParent(index)];
			index=getParent(index);
		}
		heap[index]=newValue;
		
		
	}
	
	public void fixHeapBelow(int index,int stopIndex) {
		int childToStop;
		while(index<=stopIndex) {
		    int leftChild=getChild(index, true);
		    int rightChild=getChild(index, false);
	     if(leftChild<=stopIndex) {
	    	 if(rightChild>stopIndex) {
	    		 childToStop=leftChild;
	    	 }
	    	 else {
	 	    	childToStop=heap[leftChild]>heap[rightChild] ? leftChild:rightChild; 
	 	     }
	 	     
	 	     if(heap[index]<heap[childToStop]){
	 	    	 int tem=heap[index];
	 	    	 heap[index]=heap[childToStop];
	 	    	 heap[childToStop]=tem;
	 	     } else {
	 	    	 break;
	 	     }
	 	    index=childToStop;
	     } else {
	    	 break;
	     }
		}
	
		
		
	}
	
	public int getChild(int index,boolean left) {
		return 2*index+(left?1:2); 
	}
	
	public int getParent(int index) {
		return (index-1)/2;
	}
	
	public boolean isFull() {
		return size==heap.length;
	}
	
	public void printHeap() {
		for(int i=0;i<size;i++) {
			System.out.println(heap[i]);
		}
	}

}
