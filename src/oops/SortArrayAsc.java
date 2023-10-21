package oops;

import java.util.Arrays;

public class SortArrayAsc {

	public static void main(String[] args) {
		int []array = new int [] {-3,-8,1,5,8,6,3};
		System.out.println("original array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+ ",");
		}
		Arrays.sort(array);
		System.out.println();
		
		System.out.println("Elements of arrray sorted in ascending order : "+ Arrays.toString(array));

}
}
