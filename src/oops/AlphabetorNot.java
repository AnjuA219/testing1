package oops;

import java.util.Scanner;

public class AlphabetorNot {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c = obj.next().charAt(0);
		
		if((c>=97 && c<=122) || (c>=65 && c<=90))
			System.out.print("entered charecter is an alphabet");
			else
			{
			 System.out.println("entered charecter is not an alphabet");	
			}
		}
			
	}


