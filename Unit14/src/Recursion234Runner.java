//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
		RecursionFunOne a = new RecursionFunOne();
		System.out.println("COUNT EVEN DIGITS");
		System.out.println(a.countOddDigits(4532));
		System.out.println(a.countOddDigits(11145322));
		System.out.println(a.countOddDigits(224532714));
		System.out.println(a.countOddDigits(2468));
		System.out.println(a.countOddDigits(13579));

		//add more test cases
		RecursionFunThree b = new RecursionFunThree();
		System.out.println("LUCKY THREES");
		System.out.println(b.luckyThrees(3));
		System.out.println(b.luckyThrees(31332));
		System.out.println(b.luckyThrees(134523));
		System.out.println(b.luckyThrees(3113));
		System.out.println(b.luckyThrees(13331));
		System.out.println(b.luckyThrees(777337777));
	}
}