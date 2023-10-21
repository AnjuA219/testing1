package oops;
class SchoolDetails {
	final String Schoolname = "Luminar";
	static String department = "English";
}

public class StaticFinal {

	public static void main(String[] args) {
		System.out.println(SchoolDetails.department);
		System.out.println(SchoolDetails.department="malayalam");	
		
		SchoolDetails ob = new SchoolDetails();
		System.out.println(ob.Schoolname);

	}

}
