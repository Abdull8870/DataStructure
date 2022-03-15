package sortingAlgorithms;

public class ShelllSort {
	
	public static void main(String[] args) {
		int[] array= {2,3,4,5,6,12,13,0,2,-4,122,-22};
		for(int gap=array.length/2;gap>0;gap=gap/2) {
			for(int i=gap;i<array.length;i++) {
				int val=array[i];
				int j=i;
				while(j>=gap && array[j-gap]>val) {
					array[j]=array[j-gap];
					j=j-gap;
				}
				array[j]=val;
			}
		}
		
		for(int i:array) {
			System.out.println(i);
		}
      	

}
}