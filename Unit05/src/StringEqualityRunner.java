//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality equ = new StringEquality();
		equ.setWords("hello", "goodbye");
		System.out.print(equ.toString());
		equ.setWords("one", "two");
		System.out.print(equ.toString());
		equ.setWords("three", "four");
		System.out.print(equ.toString());
		equ.setWords("TCEA", "UIL");
		System.out.print(equ.toString());
		equ.setWords("State", "Champions");
		System.out.print(equ.toString());
		equ.setWords("ABC", "ABC");
		System.out.print(equ.toString());
		equ.setWords("ABC", "CBA");
		System.out.print(equ.toString());
		equ.setWords("Same", "Same");
		System.out.print(equ.toString());
		
	}
}