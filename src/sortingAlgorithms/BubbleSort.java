package sortingAlgorithms;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array= {1,2,3,5,7,8,9,0,100,22,233,455};
		for(int unSortedIndex=array.length-1;unSortedIndex>0;unSortedIndex--) {
			for(int i=0;i<unSortedIndex;i++) {
				if(array[i]>array[i+1]) {
					swap(array, i, i+1);
				}
			}
		}
/* buble sort 
 * create a unsorted index=lenght of the array-1
 * and compare i and i+1 if greater then swap 
 * time complexity O(n^2);
 * 
 */
		
		
		
		for(int i:array) {
			System.out.println(i);
		}
	}
	
	public static void swap(int[] array,int i,int j) {
		if(array[i]==array[j]) {
			return;
		} else {
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
	}

}
