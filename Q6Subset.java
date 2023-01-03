package assignment2;

import java.util.Scanner;

public class Q6Subset {
	
	public static void main(String[] args) {
		int [] arr = {10,34,32,345,56,67,76};
		System.out.println("Enter the number of elements you have in your subarray. Number should be less than "+arr.length);
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		if(count>arr.length || count<0) {
			System.out.println("Give number less than "+arr.length +" and greater than 0");
			return;
		}
		int [] subArray = new int[count];
		for(int i=0;i<count;i++){
			System.out.println("Enter the "+i+ " number");
			subArray[i] = scan.nextInt();
		}
		System.out.println("checking if enetered array is subset");
		boolean subSet=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==subArray[0] && (arr.length-i)>=subArray.length) {
				for(int j=1;j<subArray.length;j++) {
					if(!(arr[i+j]==subArray[j])) {
						subSet=false;
						break;		
					}
					else {
						subSet=true;
					}
					
				}
			}
		}
		if(subSet) {
			System.out.println("it is a subset");
		}
		else {
			System.out.println("It is not a subset");
		}
		
	}

}
