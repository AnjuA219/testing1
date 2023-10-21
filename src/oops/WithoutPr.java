package oops;

public class WithoutPr {

	public static void main(String[] args) {
		WithoutPr m = new WithoutPr();
		m.add();
	
	

	}
	//Method without parameter and without return type
	public void add()
	
	{
		int a =20;
		int b =10;
		int c= a+b;
		
		System.out.println("Sum : "+c);
	}
	//with parameter and with return type
	public int sub (int a ,int b)
	{
		int c ;
		c= a-b;
		return c;
		
	}
	

}
