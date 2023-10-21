package basics;

public class QuestionsJava {

	public static void main(String[] args) {
		//1.
		String s = "jmeter ";
		String s1 = "performance testing tool";
		System.out.println(s.concat(s1));

		//2.
		String s2 = "java language is platform independent";
		System.out.println(s2);
		System.out.println(s2.contains("language"));
		if (s2.contains("language"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
			
		
		//3.
		String s3= "selenium is used for web application";
		String a[] = s3.split(" ");
		for(String s4:a)
		{
			System.out.println(s4);
		}
		//OR
		//for(i=0;i<a.length;i++)
		//{
		//	System.out.print(ln(a[i]));
		//	if(a[i].contains("webapplication"))
		//  {
		//break;
		//}
		//}
	
	}

}
