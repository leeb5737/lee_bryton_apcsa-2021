//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	private static double a;
	private static String b;
	public static String getDiscountedBill(double bill)
	{
		if (bill > 2000) {
			a = bill * 0.85;
		}
		else {
			a = bill;
		}
		b = String.format("%.2f", a);
		return b;
	}
}