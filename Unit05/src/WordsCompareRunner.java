//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare comp = new WordsCompare();
		comp.setWords("abe", "ape");
		out.print(comp.toString());
		comp.setWords("giraffe", "gorilla");
		out.print(comp.toString());
		comp.setWords("one", "two");
		out.print(comp.toString());
		comp.setWords("fun", "funny");
		out.print(comp.toString());
		comp.setWords("123", "19");
		out.print(comp.toString());
		comp.setWords("193", "1910");
		out.print(comp.toString());
		comp.setWords("goofy", "godfather");
		out.print(comp.toString());
		comp.setWords("funnel", "fun");
		out.print(comp.toString());
		comp.setWords("fun", "fun");
		out.print(comp.toString());

	}
}