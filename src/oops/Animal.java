package oops;
//single inheritance
class Dog
{
	public void eating()
	{
		System.out.println("dog is eating");
		
	}
	
}
class Cat extends Dog
{
	public  void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}

public class Animal {
	public static void main(String[] args) {
		Cat ob= new Cat();
		ob.eating();
		ob.sleeping();
		
	}
}
