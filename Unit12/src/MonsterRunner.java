//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		String g = "y";
		Scanner keyboard = new Scanner(System.in);
		while (g.equals("y") || g.equals("Y")) {
		//ask for name and size
			System.out.println("Enter 1st monster's name : ");
			String a = keyboard.next();
			System.out.println("Enter 1st monster's size : ");
			int aa = keyboard.nextInt();
		//instantiate monster one
			Skeleton test1 = new Skeleton(a,aa);
		//ask for name and size
			System.out.println("Enter 2nd monster's name : ");
			String b = keyboard.next();
			System.out.println("Enter 2nd monster's size : ");
			int bb = keyboard.nextInt();
		//instantiate monster two
			Skeleton test2 = new Skeleton(b,bb);
			if (test1.isBigger(test2)) System.out.println("Monster one is bigger than Monster two.");
			else if (test1.isSmaller(test2))System.out.println("Monster one is smaller than Monster two.");
			else System.out.println("Monster one is the same size as Monster two.");
			if (test1.namesTheSame(test2)) System.out.println("Monster one has the same name as Monster two.");
			else System.out.println("Monster one does not have the same name as Monster two.");
			System.out.println("Continue? (y) : ");
			g = keyboard.next();
		}
	}
}