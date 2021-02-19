//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int dis = 0;
		for (int i = 0; i < ray.length; i++)
			if (ray[i] % 2 == 1) {
				dis = i;
				while (i < ray.length) {
					if (ray[i] % 2 ==0 ) return i - dis;
					else i++;
				}
			}
		return -1;
	}
}