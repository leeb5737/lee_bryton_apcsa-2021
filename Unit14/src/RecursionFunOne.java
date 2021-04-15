//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public int countOddDigits(int num)
	{
		if (num % 10 == 0) return 0;
		int a = num % 10;
		if (a % 2 == 0) return 1 + countOddDigits(num/10);
		return countOddDigits(num/10);
	}
}