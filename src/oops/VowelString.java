package oops;

public class VowelString {

	public static void main(String[] args) {
		int v =0;
		String str = "java programming language";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				v++;
			}
		}
		
		System.out.println("Count of vowels "+v);

	}

}
