package sortingAlgorithms;

public class CountingSort {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,8,9,10,11,6,18};
	  
		countingSort(array, 1, 18);
		for(int i:array) {
			System.out.println(i);
		}
	}
	
	public static void countingSort(int[] input,int min,int max) {
		int len=max-min+1;
		
		int[] coutingArray=new int[len];
		
		for(int i=0;i<input.length;i++) {
			coutingArray[input[i]-min]++;
		}
		int j=0;
		
		for(int i=min;i<=max;i++) {
			while(coutingArray[i-min]>0) {
				input[j++]=i;
				coutingArray[i-min]--;
			}
		}
	}
}
