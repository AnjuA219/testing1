package oops;
class Members
{
	String name;
	int rollno;
	int mark;

	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("rollno="+rollno);
		System.out.println("mark="+mark);
	}

class QstnData {
public static void main(String[] args) {
		Members m1 = new Members();
		m1.name = "arya";
		m1.rollno = 10;
		m1.mark = 50;
		m1.printdetails();
		
	}

}
}