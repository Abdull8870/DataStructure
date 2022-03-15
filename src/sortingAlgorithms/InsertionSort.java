package sortingAlgorithms;

public class InsertionSort {
	
	
public static void main(String[] args) {
 int[] array= {22,33,556,76,12,14,1,2,3,45,6};
 
 /* Insertion sort
  *  assume the array is sorted in the left side
  *  increament the array from1 to end and swap the values based on the conditions
  */
 
 for(int unSortedIndex=1;unSortedIndex<array.length;unSortedIndex++) {
	 int newValue=array[unSortedIndex];
	 int i;
	 for(i=unSortedIndex;i>0 && array[i-1]>newValue;i--) {
		 array[i]=array[i-1];
	 }
	 array[i]=newValue;
	 
 }
 
 for(int i:array) {
	 System.out.println(i);
 }
 
}

}
