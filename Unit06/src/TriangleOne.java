//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word, newstring;

	public TriangleOne()
	{
		word="";
		newstring = "";
	}

	public TriangleOne(String s)
	{
		word = s;
		newstring = "";
	}

	public void setWord(String s)
	{
		word = s;
		newstring = "";
		for (int a = 0; a< s.length();a++) {
			newstring = newstring + "\n" + word.substring(0, word.length()-a);
		}
		newstring = newstring + "\n";
	}

	public String toString()
	{
		return newstring;
	}
}