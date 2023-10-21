package oops;
class Parent
//method overriding
{
	//String name ="abc";
	public void phone()
	{
		System.out.println("nokia");
	}
}
class Child extends Parent
{
	public void phone()
	{
		//System.out.println(super.name)
		super.phone();
		System.out.println("iphone");
	}
}
public class Metodoveridingg {

	public static void main(String[] args) {
		Child c= new Child();
		//c.phone();//we got only child details
		//c.phone
		c.phone();
		
		//c.car();
		//parent p= new parent();
		//p.phone();
		
	}

}
