//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		char a = 'A';
		int b;
		while (a != 'E') {
			Scanner keyboard = new Scanner(System.in);
			out.print("Enter a whole number:: ");
			b = keyboard.nextInt();
			System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
			System.out.println("5 is even :: " + NumberVerify.isEven(5));
			out.print("Do you want to continue (type E if you don't): ");
			a = keyboard.next().charAt(0);
		}
		
		//add in more test cases
		System.out.println("12441 is odd :: " + NumberVerify.isOdd(12441));
		System.out.println("8875634 is even :: " + NumberVerify.isEven(8875634));
		System.out.println("2634 is odd :: " + NumberVerify.isOdd(2634));
		System.out.println("653 is even :: " + NumberVerify.isEven(653));

	}
}