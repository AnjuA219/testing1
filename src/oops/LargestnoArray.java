package oops;

public class LargestnoArray {

	public static void main(String[] args) {
		int arr[] = {14,8,65,45,23,50};
		int max = arr [0];
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
			 max = arr[i];	
			}
		}
		

	System.out.print(max);
	}
}
