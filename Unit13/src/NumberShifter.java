//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	int[] a;
	public int[] makeLucky7Array( int size)
	{
		a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10 + 1);
		}
		return a;
	}
	public void shiftEm(int[] array)
	{
		int location = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				array[i] = array[location];
				array[location] = 7;
				location++;
			}
		}
	}
	public String toString() {
		return Arrays.toString(a);
	}
}