//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int counter = 0;
    	for (int i = 0; i < size; i++) {
        	for (int j = 0; j < size; j++) {
        		m[i][j] = ""+str.charAt(counter);
        		counter++;
        	}
        		
    	}
    }

    public boolean isFound( String word )
    {
    	int length = 0;
    	for (int c = 0; c < m.length; c++) {
    		for (int r = 0; r < m[c].length; r++) {
    			if (m[c][r].equals("" + word.charAt(length))) {
    				int ctemp = c, rtemp = r;
    				String check = word.substring(1,word.length());
    				for (int wlength = 0; wlength < check.length(); wlength++) {
    					if (checkRight("" + check.charAt(wlength),r,c)) {
    						r+=1;
    						if (wlength == check.length() - 1) return true;
    					}
    					else if (checkLeft("" + check.charAt(wlength),r,c)) {
    						r-=1;
    						if (wlength == check.length() - 1) return true;
    					}
    					else if (checkUp("" + check.charAt(wlength),r,c)) {
    						c-=1;
    						if (wlength == check.length() - 1) return true;
    					}
    					else if (checkDown("" + check.charAt(wlength),r,c)) {
    						c+=1;
    						if (wlength == check.length() - 1) return true;
    					}
    					else if (checkDiagUpRight("" + check.charAt(wlength),r,c)) {
    						r+=1;
    						c-=1;
    						if (wlength == check.length() - 1) return true;
    					}
    					else if (checkDiagUpLeft("" + check.charAt(wlength),r,c)) {
    						r-=1;
    						c-=1;
    						if (wlength == check.length() - 1) return true;
    					}
    					else if (checkDiagDownLeft("" + check.charAt(wlength),r,c)) {
    						r-=1;
    						c+=1;
    						if (wlength == check.length() - 1) return true;
    					}
    					else if (checkDiagDownRight("" + check.charAt(wlength),r,c)) {
    						r+=1;
    						c+=1;
    						if (wlength == check.length() - 1) return true;
    					}
    					else break;
    					
    				}
    				c = ctemp;
    				r = rtemp+1;
    			}
        		
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		if (intbounds(r + 1,c)) {
			if (m[c][r + 1].equals(w)) return true;
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if (intbounds(r - 1,c)) {
			if (m[c][r - 1].equals(w)) return true;
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (intbounds(r,c - 1)) {
			if (m[c - 1][r].equals(w)) return true;
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		if (intbounds(r,c + 1)) {
			if (m[c + 1][r].equals(w)) return true;
		}
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if (intbounds(r + 1,c - 1)) {
			if (m[c - 1][r].equals(w)) return true;
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if (intbounds(r - 1,c - 1)) {
			if (m[c - 1][r - 1].equals(w)) return true;
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if (intbounds(r - 1,c + 1)) {
			if (m[c + 1][r - 1].equals(w)) return true;
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if (intbounds(r + 1,c + 1)) {
			if (m[c + 1][r + 1].equals(w)) return true;
		}
		return false;
	}
	public boolean intbounds(int r, int c) {
		if (r >= 0 && r < m[0].length) {
			if (c >= 0 && c < m.length) {
				return true;
			}
			return false;
		}
		return false;
	}

    public String toString()
    {
    	String rtr = "";
    	for (int i = 0; i < m.length;i++) {
    		rtr+= Arrays.toString(m[i]) + "\n";
    	}
 		return rtr;
    }
}
