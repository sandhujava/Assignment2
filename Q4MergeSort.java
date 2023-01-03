package assignment2;

public class Q4MergeSort {

	public static void main(String[] args) {
	     int [] arr = {10,3,45,32,54,2,31,93};
	     divide(arr,0,arr.length-1);
	     
	     System.out.println("Sorted ARray");
	     for(int elem:arr) {
	    	 System.out.println(elem+ " ");
	     }

	}

	private static void divide(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int mid=start+(end-start)/2;
		
		divide(arr,start,mid);
		divide(arr,mid+1,end);
		merge(arr,start,mid,end);
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		int [] merged = new int[end-start+1];
		
		int index1Array = start;
		int index2Array= mid+1;
		int indexMergedArray=0;
		while(index1Array<=mid && index2Array<=end) {
			if(arr[index1Array]<=arr[index2Array]) {
				merged[indexMergedArray++] = arr[index1Array++];
				
			}
			else {
				merged[indexMergedArray++] = arr[index2Array++];
				
			}
			
		}
		while(index1Array<=mid) {
			merged[indexMergedArray++]=arr[index1Array++];
		}
		while(index2Array<=end) {
			merged[indexMergedArray++]=arr[index2Array++];
		}
		
		for(int i=0,j=start;i<merged.length;i++,j++) {
			arr[j]=merged[i];
		}
		
	}

}
