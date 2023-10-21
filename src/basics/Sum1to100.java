package basics;

public class Sum1to100 {

	public static void main(String[] args) {
		// for loop
		int a=100, sum=0;
		for(int i=1;i<=a;i++)
		{
			sum = i+sum;
		}
		System.out.println("sum is "+sum);

	}

}
