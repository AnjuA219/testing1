package basics;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
			int a[] = new int[6];//declare array
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your numbers : ");
			for(int i=0;i<6;i++)//i = index no // to read numbers
			{
				a[i] = sc.nextInt();//store values to array
			}
			System.out.println("entered numbers are: ");
			for (int i=0;i<6;i++);//to print the numbers
			{

				int i = 0;
				System.out.println(a[i]);
			}
		}
		
		
		
	}

