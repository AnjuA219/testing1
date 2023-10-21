package basics;

public class Calculatorswitch {

	public static void main(String[] args) {
		int a=5,b=2,result;
		char operator= '+'; 
		
		switch (operator)
		{
		case '+':
			result = a+b;
			System.out.println(result);
			break;
		case '-':
			result = a-b;
			System.out.println(result);
			break;
		case '*':
			result = a*b;
			System.out.println(result);
			break;
		case '/':
			result = a/b;
			System.out.println(result);
			break;
			default:
				System.out.println("Invalid operator");
				break;
		}

	}

}
