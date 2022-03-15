package sortingAlgorithms;

public class SelectionSort {
	
public static void main(String[] args) {
	int[] arraay= {1,2,3,4,5,6,8,9,10,11,23};
	
	/* Selection sort - Like bubble sort but slight different
	 *  creates a larger value as element in index zero and compare with rest of the array
	 *  swap the largest value with the element in the last
	 *  
	 */	
	
	for(int unSortedIndex=arraay.length-1;unSortedIndex>0;unSortedIndex--) {
		int largest=0;
		for(int i=1;i<=unSortedIndex;i++) {
			if(arraay[i]>arraay[largest]) {
				largest=i;
			}
		}
		swap(arraay,largest,unSortedIndex);
	}
	
	for(int j:arraay) {
		System.out.println(j);
	}
	
}

public static void swap(int[] array,int i,int j) {
	
	if(array[i]==array[j]) {
		return;
	}
    int temp=array[i];
    array[i]=array[j];
    array[j]=temp;
}

}
