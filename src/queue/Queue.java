package queue;

import java.sql.Array;

public class Queue {

	private Employee que[];
    private int front=0;
    private int back=0;

    public Queue(int size) {
    que=new Employee[size];
     }

  public void addToQueue(Employee emp) {
	  
	  
	  
	if(getSize()==que.length-1) {
		System.out.println("Inside increase length"+"\n BAck="+back+"\nnumber of items= "+
	que.length);
		int numItem=que.length;
		Employee[] newArray=new Employee[2*que.length];
	    System.arraycopy(que, 0, newArray,front,que.length-front);
	    System.arraycopy(que, 0, newArray,que.length-front,back);
	    que=newArray;
	    front=0;
	    back=numItem;
	}
	System.out.println("Back= "+back);
	que[back]=emp;
	
	if(back<que.length-1) {
		back++;
	} else {
		back=0;
	}
	System.out.println("size= "+getSize()+"\nquelenght="+ que.length+" "+"\nfront="+front
			+" "+"back= "+back);
	
		
	  }
  
  public int getLength() {
	  return back-front;
  }
  
  public void removeFromFront() {
	  if(getSize()==0) {
		  throw new NullPointerException();
	  }
	 
		que[front]=null;
	    front++;
		System.out.println("front= "+front);
	    if(getSize()==0) {
	    	front=0;
	    	  back=0;
		} 
	    else if(front==que.length) {
	    front=0;
    	  
	  }
	  
  }
  
  public void printQueue() {
	  if(back<que.length-1) {
		  for(int i=front;i<back;i++) {
			  System.out.println(que[i]);
		  }  
	  } else {
		  for(int j=front;j<=que.length-1;j++) {
			  System.out.println(j);
		  }
		  for(int i=0;i<front;i++) {
			  System.out.println(i);
		  }
	  }
	  
  }
  
  private int getSize() {
	  if(front<=back) {
	  return back-front;
	  } else {
		  return back-front+que.length;
	  }
  }
  
}
