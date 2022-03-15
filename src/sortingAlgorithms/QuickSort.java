package sortingAlgorithms;

public class QuickSort {

	public static void main(String[] args) {
	
		int[] array= {2,3,6,8,-3,-55,11,22,-987};
		quickSort(array, 0, array.length);
		for(int i:array) {
			System.out.println(i);
		}
	}
	
	public static void quickSort(int[] array,int start,int end) {
		if(end-start<2) {
			return ;
		}
		
		int pivot=partition(array,start,end);
		quickSort(array, start,pivot);
		quickSort(array,pivot+1,end);
	}
	
	public static int partition(int[] array,int start,int end) {
		
		int pivotValue=array[start];
		int i=start;
		int j=end;
		
		while(i<j) {
			
			while(i<j && array[--j]>=pivotValue);
			if(i<j) {
				array[i]=array[j];
			}
			
			while(i<j && array[++i]<=pivotValue);
			if(i<j) {
				array[j]=array[i];
			}
			
			
		}
		array[j]=pivotValue;
		return j;
	}
}
