//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	static char a = 'A';
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		while (a != 'E') {
			out.print("Enter the original bill amount :: ");
			double amt = keyboard.nextDouble();
			out.print("Bill after Discount: " + Discount.getDiscountedBill(amt));
			out.print("\nDo you want to continue (type E if you don't): ");
			a = keyboard.next().charAt(0);
		}
			out.println("Sample Data and Outputs: ");
			out.println("Enter the original bill amount :: 500");
			out.println("Bill after Discount: " + Discount.getDiscountedBill(500));
			out.println("Enter the original bill amount :: 2000");
			out.println("Bill after Discount: " + Discount.getDiscountedBill(2000));
			out.println("Enter the original bill amount :: 4000");
			out.println("Bill after Discount: " + Discount.getDiscountedBill(4000));
			out.println("Enter the original bill amount :: 333.33");
			out.println("Bill after Discount: " + Discount.getDiscountedBill(333.33));
			out.println("Enter the original bill amount :: 95874.2154");
			out.println("Bill after Discount: " + Discount.getDiscountedBill(95874.2154));

	}
}