package problems;

import java.util.LinkedList;

public class StackandQueue {

	 public static boolean checkPalindrom(String s) {
		 LinkedList<Character> stack=new LinkedList<Character>();
		 LinkedList<Character> queue=new LinkedList<Character>();
		 String word=s.toLowerCase();
		 for(int i=0;i<word.length();i++) {
			 if(word.charAt(i)>='a' && word.charAt(i)<='z') {
				 queue.addLast(word.charAt(i));
				 stack.push(word.charAt(i));
			 }
		 }
		 
		 System.out.println("que= "+queue);
		 System.out.println("stack= "+stack);
		 while(!stack.isEmpty()) {
			 if(!stack.pop().equals(queue.removeFirst())) {
				 return false;
			 }
		 }
		 return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     boolean checkPalindrom = checkPalindrom("Markram");
     String answer=checkPalindrom? "Is palindrome":" Not palindrom";
     System.out.println(answer);
	}

}
