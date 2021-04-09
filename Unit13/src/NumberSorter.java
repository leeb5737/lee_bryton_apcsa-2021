//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	public int[] getSortedDigitArray(int number)
	{
		int len = getNumDigits(number);
		int[] sort = new int[len];
		for (int i = 0; number > 0; i++) {
			sort[i] = number % 10;
			number = number / 10;
		}
		for (int i = 0; i < len - 1; i++) {
			if (sort[i] > sort[i + 1]) {
				int a = sort[i];
				sort[i] = sort[i + 1];
				sort[i + 1] = a;
				i = -1;
			}
		}
		return sort;
	}
}