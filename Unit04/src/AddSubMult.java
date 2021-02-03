//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static String check( double a, double b )
	{
		double g;
		if (a > b) {
			g = a - b;
		}
		else if (b > a){
			g = b - a;
		}
		else {
			g = a * b;
		}
		return String.format("%.1f",g);
	}
}