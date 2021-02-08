//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover cleaned = new LetterRemover();
		cleaned.setRemover("I am Sam I am", 'a');
		out.println(cleaned);
		cleaned.setRemover("ssssssssxssssesssssesss", 's');
		out.println(cleaned);
		cleaned.setRemover("qwertyqwertyqwerty", 'a');
		out.println(cleaned);
		cleaned.setRemover("abababababa", 'b');
		out.println(cleaned);
		cleaned.setRemover("abaababababa", 'x');
		out.println(cleaned);
		//add test cases		
											
	}
}