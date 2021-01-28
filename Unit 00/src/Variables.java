//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Bryton L.
//Date - 28 January 2021
//Class - AP Computer Science A
//Lab  - 0b 1 Variables

public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = -127;
		short shortOne = 32767;
		int intOne = -2147483647;
		long longOne = 2147483647;


		//decimal variables
		float floatOne = -12.12345f;
		float floatTwo = 2147483647;
		double doubleOne = 123.890;

		//other integer types
		char charOne= 74;

		//other types
		boolean booleanOne = true;
		String stringOne= "hello";

		//output your information here
		System.out.println("/////////////////////////////////////////");
		System.out.println("* Bryton L.       28 January 2021\t*");
		System.out.println("*                               \t*");
		System.out.println("*        integer types          \t*");
		System.out.println("*                               \t*");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t\t*");
		System.out.println("*16 bit - shortOne = "+shortOne+"\t\t*");
		System.out.println("*32 bit - byteOne = "+intOne+"\t\t*");
		System.out.println("*64 bit - byteOne = "+longOne+"\t\t*");
		System.out.println("*\t\t\t\t\t*");
		System.out.println("*        real types          \t\t*");
		System.out.println("*32 bit - floatOne = "+floatOne+"\t\t*");
		System.out.println("*32 bit - floatOne = "+floatTwo+"(no f)\t*");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"\t\t*");
		System.out.println("*\t\t\t\t\t*");
		System.out.println("*           other integer types        \t*");
		System.out.println("*charOne = "+charOne+"\t\t\t\t*");
		System.out.println("*           other types        \t\t*");
		System.out.println("*booleanOne = "+booleanOne+"\t\t\t*");
		System.out.println("*stringOne = "+stringOne+"\t\t\t*");
		System.out.println("/////////////////////////////////////////");

	}
}