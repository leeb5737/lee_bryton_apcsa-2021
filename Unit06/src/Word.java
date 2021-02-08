//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		int a = 1;
		while (a <= word.length()) {
			back = back + word.substring(word.length()-a,word.length()-a+1);
			a++;
		}
		return back;
	}

 	public String toString()
 	{
 		return String.valueOf(getFirstChar()) + "\n" +
 				String.valueOf(getLastChar())+ "\n"+ 
 				getBackWards()+ "\n" + word + "\n";
	}
}