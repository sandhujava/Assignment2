package assignment2;

public class Q2 {
	
	
	private void quickSort(int[] unsortedArray, int lowIndex, int highIndex) {
		if(lowIndex>=highIndex) {
			return;
		}
		int pivotIndex = partition(unsortedArray,lowIndex,highIndex);
		quickSort(unsortedArray,lowIndex,pivotIndex-1);
		quickSort(unsortedArray, pivotIndex+1, highIndex);
		
		
	}

	private int partition(int[] unsortedArray, int lowIndex, int highIndex) {
		
		int pivot=highIndex;
		int i=lowIndex-1;
		
		for(int j=lowIndex;j<=highIndex;j++) {
			if(unsortedArray[j]<unsortedArray[pivot]) {
				i++;
				swap(unsortedArray,i,j);
			}
		}
		i++;
		swap(unsortedArray,i,pivot);
		
		return i;
	}

	private void swap(int[] unsortedArray, int i, int j) {
		int  temp = unsortedArray[i];
		unsortedArray[i]=unsortedArray[j];
		unsortedArray[j]=temp;
		
		
	}

	public static void main(String[] args) {
		
		
		Q2 quick = new Q2();
		int [] unsortedArray = {23,43,1,22,12,11,10,97};
		
		quick.quickSort(unsortedArray,0,unsortedArray.length-1);
		
		System.out.println("Sorted array");
		for(int elem:unsortedArray) {
			System.out.print(elem + " ");
		}
			
		}
		

	}

	

	

