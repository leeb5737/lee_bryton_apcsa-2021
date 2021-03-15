//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy try1 = new Toy ("sorry");
		try1.setCount(1);
		System.out.println(try1.toString());
		
		Toy try2 = new Toy ("gi joe");
		try2.setCount(5);
		System.out.println(try2.toString());
	}
}