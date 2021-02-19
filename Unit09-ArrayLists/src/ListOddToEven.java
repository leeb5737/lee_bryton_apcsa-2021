//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int start = 0, end = 0;
		for (int i = 0; i < ray.size();i++)
			if (ray.get(i) % 2 == 1) {
				start = i;
				while (i < ray.size()) {
					if (ray.get(i) % 2 == 0) end= i;
					i++;
				}
			}
		if (end != 0) return end - start;
		return -1;
	}
}