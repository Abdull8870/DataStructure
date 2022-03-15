package sortingAlgorithms;

public class RadixSort {

	public static void main(String[] args) {
		
		int[] array= {2222,3333,1111,4444,6666,7777,1111,1234};
		
		radixSort(array, 10, 4);
		for(int i:array) {
			System.out.println(i);
		}
		
	}
	
	public static void radixSort(int[] input,int radix,int width) {
		for(int i=0;i<width;i++) {
			rSort(input, i, radix);
		}
	}
	
	public static void rSort(int[] input,int position,int radix) {
		
		int[] countArry=new int[radix];
		int numOfItems=input.length;
		int[] temp=new int[numOfItems];
		
		
		for(int i:input) {
			countArry[getPosition(i, position, radix)]++;
		}
		
		for(int j=1;j<radix;j++) {
			countArry[j]+=countArry[j-1];
		}
		
		
	
		for(int i=numOfItems-1;i>=0;i--) {
			
//		    System.out.println(countArry[getPosition(input[i], position, radix)]);	
			temp[--countArry[getPosition(input[i], position, radix)]]=input[i];
		}
		
		for(int j=0;j<numOfItems;j++) {
			input[j]=temp[j];
		}
		
	 
	}
	
	public static int getPosition(int value,int position,int radix) {
		int pos= value/(int) Math.pow(radix, position) % 10;
//		System.out.println("position ="+pos);
		return pos;
	}
}
