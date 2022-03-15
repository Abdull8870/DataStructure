package tress;

public class Node {
 public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public void setValue(int value) {
		this.value = value;
	}

private int value;
 private Node leftChild;
 private Node rightChild;
 
 public int getValue() {
	 return this.value;
 }
 
 public Node(int value) {
	 this.value=value;
 }
 
 public void insert(int data) {
	 if(value==data) {
		 return;
	 }
	 if(value>data) {
		 if(leftChild !=null) {
			 leftChild.insert(data);
		 } else {
			 leftChild=new Node(data);
		 }
	 } else {
		 if(rightChild !=null) {
			 rightChild.insert(data);
		 } else {
			 rightChild=new Node(data);
		 }
	 }
 }
 
 public void inorderTraversal() {
	if(leftChild!=null) {
		leftChild.inorderTraversal();
	}
	 System.out.println(value+" ");
     if(rightChild!=null) {
	 rightChild.inorderTraversal();
 }
	
 }
   public void max() {
	   if(rightChild!=null) {
		   rightChild.max();
	   }else {
	   System.out.println("Max is:"+value);
   }
	   }
   
   public int min() {
	   int min = 0;
	   if(leftChild!=null) {
		   leftChild.min();
	   } else {
	  min= value;
   }
	   return min;
	   }
 


}
