package oops;

public class Empconstructor {
//define class variables
	int empid;
	int salary;
	String designation;
	//constructor
	
	public Empconstructor()
	{
		empid=111;
		salary=20000;
		designation="Tester";
		
	}
	
	//public void employee()
	
	public static void main(String[] args)
	{
		Empconstructor ob = new Empconstructor();//create obj to invoke constructor
		System.out.println(ob.empid);
		System.out.println(ob.salary);
		System.out.println(ob.designation);
	}
	
}
