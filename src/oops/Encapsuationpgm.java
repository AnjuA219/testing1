package oops;
class Encap
{
	private String name;
	private String designation;
	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
public class Encapsuationpgm {

	public static void main(String[] args) {
		Encap ob = new Encap();
		ob.setName("Rakhy");
		System.out.println(ob.getName());

	}

}
