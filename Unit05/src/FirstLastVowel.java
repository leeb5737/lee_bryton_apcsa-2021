//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
	private String gg, o, c;
   public String go( String a )
	{
	if (a.length() <= 1) {
		gg = a;
		o = "b";
		c = check(gg, o);
	}
	else {
		gg = a.substring(0,1);
		o = a.substring(a.length()-1);
		c = check(gg,o);
	}
	   return c;
}
   public String check(String p, String end) {
	   int go = 0;
	   if (p.equals("a") || p.equals("e") || p.equals("i") || p.equals("o") || p.equals("u") || p.equals("A") || p.equals("E") || p.equals("I") || p.equals("O") || p.equals("U")) {
		   go = 1;
	   }
	   else if (end.equals("a") || end.equals("e") || end.equals("i") || end.equals("o") || end.equals("u") || end.equals("A") || end.equals("E") || end.equals("I") || end.equals("O") || end.equals("U")) {
		   go = 1;
	   }
	   else {}
	   if (go == 1) {
		   return "yes";
	   }
	   else {
	   return "no";
	   }
}
}
