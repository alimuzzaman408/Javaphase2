package pack1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=input.nextInt();

		int a=100;
		try 
		{
			double res=a%number;
			System.out.println("Result is::"+res);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception occured and handled ");
		}

		input.close();



	}

}
