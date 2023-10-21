package oops;
class Members1
{
	String name;
	int age;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
		
	}
}
class Worker extends Members1
{
	String specialization;
}
class Manager extends Members1
{
	String department;
	
}
public class Question {

	public static void main(String[] args) {
		Worker e1= new Worker();
		e1.name = "anu";
		e1.age= 23;
		e1.address="abvsdd";
		e1.salary=25000;
		e1.printdetails();
		
		e1.specialization = "Selenium";
		System.out.println("specialization "+ e1.specialization);
		
		Manager e2= new Manager();
		e2.name="anant";
		e2.age=26;
		e2.address="pkhdg";
		e2.salary=29000;
		e2.printdetails();
		e2.department="Manager";
		System.out.println("department "+ e2.department);
		
	}

}
