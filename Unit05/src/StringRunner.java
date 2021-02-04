//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{

	public static void main ( String[] args )
	{
		StringOddOrEven stroe = new StringOddOrEven();
		Scanner keyboard = new Scanner(System.in);
		String oe;
		char g = 'A';
		while (g != 'E') {
		out.print("Enter a word: ");
		oe = keyboard.nextLine();
		stroe.setString(oe);
		out.println("Using isEven (boolean): " + stroe.isEven());
		out.println("Using toString (string): " + stroe.toString());
		out.print("Do you want to continue (type E if you don't): ");
		g = keyboard.next().charAt(0);
		}
		out.println("Samples");
		stroe.setString("cat");
		out.println("Entered Value: cat \n cat is " + stroe.toString());
		stroe.setString("boot");
		out.println("Entered Value: boot \n boot is " + stroe.toString());
		stroe.setString("it");
		out.println("Entered Value: it \n it is " + stroe.toString());
		stroe.setString("a");
		out.println("Entered Value: a \n a is " + stroe.toString());
		stroe.setString("eleven");
		out.println("Entered Value: eleven \n eleven is " + stroe.toString());
		stroe.setString("thirteen");
		out.println("Entered Value: thirteen \n thirteen is " + stroe.toString());
		stroe.setString("odd");
		out.println("Entered Value: odd \n odd is " + stroe.toString());
		stroe.setString("even");
		out.println("Entered Value: even \n even is " + stroe.toString());
	}
}