package oops;

public class FinallyPgm {

	public static void main(String[] args) {
		System.out.println("started");
		try
		{
			int i= 0;
			System.out.println(i/0);
			
			}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("this is finally");
		}
		System.out.println("stopped");
	}

}
