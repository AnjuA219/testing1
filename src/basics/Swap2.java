package basics;

public class Swap2 {

	public static void main(String[] args) {
		// Swap without using third variable
		int a = 25;
		int b= 23;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: a = " +a + " and b= "+b);

	}

}
