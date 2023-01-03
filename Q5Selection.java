package assignment2;

public class Q5Selection {

	public static void main(String[] args) {
		
		int [] arr = {10,8,23,45,3,2,123,43};
		
		for(int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[smallest]) {
					smallest=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
			
					
		}
		System.out.println("Sorted array");
		for(int elem:arr) {
			System.out.print(elem+" ");
			
		}

	}

}
