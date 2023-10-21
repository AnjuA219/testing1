package basics;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
	if (age>1 && age<18)
	{
		System.out.println("Minor");
	}
	else if (age>=18 && age<60)
	{
		System.out.println("Major");
	
	}
	else if (age>60)
	{
		System.out.println("Retired");
	}
	else
	{
		System.out.println("invalid data");
	}
	}

}
