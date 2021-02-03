//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		String o;

		out.print("Enter in x1 :: ");
		int x1 = keyboard.nextInt();

		out.print("Enter in y1 :: ");
		int y1 = keyboard.nextInt();

		out.print("Enter in x2 :: ");
		int x2 = keyboard.nextInt();

		out.print("Enter in y2 :: ");
		int y2 = keyboard.nextInt();

		Distance a = new Distance(x1, y1, x2, y2);
		a.calcDistance();
		out.print("Using print: ");
		a.print();
		out.println();
		o = a.toString();
		out.print("Using toString: " + o);
			
	}
}