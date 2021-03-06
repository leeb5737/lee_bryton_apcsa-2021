/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int pos = sample.indexOf("the");
		if(pos != -1)
		System.out.println("slow is found at position " + pos);
		else
		System.out.println("slow is not found");
		String str = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		String printer = "";
		int strc=0, tally = 0;
		while (str.indexOf("the",strc)!=-1) {
			printer = printer+ str.indexOf("the",strc) + ", ";
			System.out.println(printer);
			strc = str.indexOf("the")+1+strc;
			tally++;
		}
		System.out.println("the is found " + tally + " times at: " + printer.substring(0,printer.length()-2));
		
	}
}
/*		while (ph.indexOf("the")!=-1) {
System.out.println("the is found at: " + (ph.indexOf("the")+strc));
strc = ph.indexOf("the")+1+strc;
ph= str.substring(strc);
}*/