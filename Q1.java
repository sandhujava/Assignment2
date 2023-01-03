package assignment2;

public class Q1 {
    //Program to find duplicate
	public static void main(String[] args) {
		
		int [] arr = {23,34,23,45,34,65,65,65,45,86,98,87,86};
		int [] duplicate= new int[arr.length];
		int count=0;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicate[count]=arr[i];
					count++;
				}
			}
		}
		System.out.println("There are "+count+" duplicates and these are ");
		for(int i=0;i<count;i++) {
			System.out.println(duplicate[i]);
		}
		

	}

}
