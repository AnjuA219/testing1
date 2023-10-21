package oops;
class Car
{
	public void speed()
	{
		System.out.println("car speed");
	}
	public void power()
	{
		System.out.println("car power");
	}
}
	class BMW extends Car
	{

		@Override
		public void speed() {
			System.out.println("bmw speed");
			super.speed();
		}

		@Override
		public void power() {
			System.out.println("bmw power");
			super.power();
		}
		
	}
public class Methodoverride {

	public static void main(String[] args) {
		BMW obj = new BMW ();
		obj.speed();
		obj.power();
	}

}
