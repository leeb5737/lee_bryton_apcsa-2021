
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
	int outer = 0,inner = 0, l = 10;
	private List<Integer> a;
	
	
    public List<Integer> getRowTotals( int[][] m )
    {
    	a = new ArrayList<Integer>(m.length);
    	int l = 0;
    	for (int[] i : m) {
    		a.add(0);
    		for (int j : i) {
    			a.set(l, a.get(l) + j);
    			
    		}
    		l++;
    	}
    	return a;
    }
}
