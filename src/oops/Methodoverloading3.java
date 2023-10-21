package oops;
//overload by changing order
public class Methodoverloading3 {
	public void add(int a,double b)
	{
		double c =a+b;
		System.out.println(c);
	
	}
	public void add(double a,int b)
	{
		double d = a+b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Methodoverloading3 ob= new Methodoverloading3();
		ob.add(3, 5.2);
		ob.add(3.5, 5);
	}

}
