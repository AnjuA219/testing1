package oops;
//same name different datatype
public class Methodoverloading2 {
	public void add(int a,int b )
	{
		int c= a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double value = a+b;
		System.out.println(value);
	}

	public static void main(String[] args) {
		Methodoverloading2 ob = new Methodoverloading2();
		ob.add(5, 6);
		ob.add(4, 6.6);
		

	}

}
