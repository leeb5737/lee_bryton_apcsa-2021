//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	private String rtrstr = "";
	//instance variables and constructors could be present, but are not necessary
		
	public static void printWord(String word, int times)
	{
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}
}