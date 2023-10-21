package basics;

public class Concatlengthstring {

	public static void main(String[] args) {
		//length of string
		String s = "Welcome";
		System.out.println(s.length());
		int w = s.length();
		System.out.println("length is "+w);
		//join two string
		String s1 = "Hello";
		String s2 = "Luminar";
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2);
		System.out.println(1+2+s1);
		System.out.println(s1+1+2);
		
		String s5 = "Luminar";
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s5.endsWith("e"));
		System.out.println(s5.startsWith("L"));
		
		//Compare two string
		String a= "abc";
		String b= "Abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a==b);
		
		//Trim
		String q= " hello ";
		System.out.println(q);
		System.out.println(q.trim());
		
		//extract portion
		String y="welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(0,4));
		
		//Words/char present or not 
		String x = "Welcome to Luminar";
		System.out.println(x.contains("luminar"));	
		
		//replace()
		System.out.println(y.replace("el","xy"));
		
		//To display particular character
		String z= "welcome";
		System.out.println(z.charAt(4));
		
		//split
		String w1="welcome to Luminar";
		String[] words = w1.split(" ");
		//for (String 1: words)
		{
			System.out.println(1);
		}
		
		//to char array
		String t= "hello";
		char[]c1=t.toCharArray();
		for (char v:c1)
		{
			System.out.println(v);
		}
		
		
		}

}
