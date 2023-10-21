package oops;

class Dog1
{
	public void eating()
	{
		System.out.println("dog is eating");
	}
}
class Cat1 extends Dog1
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}
 	class Lion extends Cat1
 	{
 		public void running()
 		{
 			System.out.println("lion is running");
 		}
 	}

public class MultipleInherit {
	public static void main(String[] args)
	{
		Cat1 ob = new Cat1 ();
		ob.eating();
		ob.sleeping();
		Lion ob1 = new Lion();
		ob1.running();
		ob1.sleeping();
		ob1.eating();
	}
}
