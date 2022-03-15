package sortingAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
	
		int[] array= {2,3,4,5,6,12,14,1022,11};
		mergeSort(array,0,array.length);
		for(int i:array) {
			System.out.println(i);
		}
}

	private static void mergeSort(int[] array, int start, int end) {
		if(end-start<2) {
			return;
		}
		int mid=(start+end)/2;
		mergeSort(array, start, mid);
		mergeSort(array, mid, end);
		merge(array, start, mid, end);
		
	}
	
	public static void merge(int[] input,int start,int mid,int end) {
		if(input[mid-1]<=input[mid]) {
			return;
		}
		int i=start;
		int j=mid;
		int[] tempArray=new int[end-start];
		int tempIndex=0;
		while(i<mid && j<end) {
			tempArray[tempIndex++]=input[i]<input[j]?input[i++]:input[j++];
		}
	System.arraycopy(input, i, input, start+tempIndex, mid-i);
	System.arraycopy(tempArray, 0, input,start,tempIndex);
	
	}
	
	
}
