package assignment2;

public class Q3BubbleSort {
	
	public static void main(String[] args) {
		int [] arr = {10,20,34,2,3,12,9,89};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp =arr[j];
					arr[j] = arr [j-1];
					arr[j-1] = temp;
				
			}
		}
		
		
		}
		for(int elem: arr) {
			System.out.print(elem+" ");
		}}}


