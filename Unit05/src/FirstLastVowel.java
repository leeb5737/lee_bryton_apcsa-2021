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
   public String check(String p, String l) {
	   int go = 0;
	   if (p == "a" || p == "e" || p == "i" || p == "o" || p == "u" || p == "A" || p == "E" || p == "I" || p == "O" || p == "U") {
		   go = 1;
	   }
	   if (l == "a" || l == "e" || l == "i" || l == "o" || l == "u" || l == "A" || l == "E" || l == "I" || l == "O" || l == "U") {
		   go = 1;
	   }
	   if (go == 1) {
		   return "yes";
	   }
	   else {
	   return "no";
	   }
}
}
