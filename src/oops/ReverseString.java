package oops;

public class ReverseString {

	public static void main(String[] args) {
		String S = "Tester";
		char[] reversed = S.toCharArray();
		for(int i=reversed.length-1;i>=0;i--)
		{
			System.out.print(reversed[i]);
		}
		

	}

}
