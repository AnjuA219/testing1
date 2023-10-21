package oops;
class Dogb  //Hierarchial inheritance
{
	public void eating()
	{
		System.out.println("dog is eating");
	}
}
class Catb extends Dogb
{
	public void sleeping()
	{
		System.out.println("cat is spleeping");
		
	}
}
class Lionb extends Dogb
{
	public void running()
	{
		System.out.println("lion is running");
	}
}

public class Hierrarchial {
	public static void main (String[] args)
	{
	Catb ob= new Catb();
	ob.eating();
	ob.sleeping();
	
	Lionb li=new Lionb();
	li.eating();
	li.running();
	}
}
