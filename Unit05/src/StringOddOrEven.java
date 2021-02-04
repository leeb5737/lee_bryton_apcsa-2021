//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word,evenodd2;
	private boolean evenodd;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
		if (word.length()%2==0) {
			evenodd = true;
			evenodd2 = "even";
		}
		else {
			evenodd = false;
			evenodd2 = "odd";
		}
	}

 	public boolean isEven()
 	{
		return evenodd;
	}

 	public String toString()
 	{
 		String output= "" + evenodd2;
 		return output;
	}
}