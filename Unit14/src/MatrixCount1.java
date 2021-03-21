//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
	private  int outer = 0, inner = 0;
    private  int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public int count( int val  )
    {
    	if (outer == m.length) { 
    		outer = 0; 
    		inner = 0;
    		return val- val;
    	}
    	if (inner == m[outer].length) {
    		inner = 0;
    		outer++;
    	}
    	else if (m[outer][inner++] == val) return 1 + count(val);
    	
    	return count(val);
    	/*int count = 0;
    	for (int[] i : m) {
    		for (int j : i) {
    			if (val == j) count++;
    		}
    	}
    	return count;*/
    }
    public String toString() {
    	String rtr = "";
    	for (int[] i : m) {
    		rtr+= Arrays.toString(i) + "\n";
    		
    }
    	return rtr;
    }
}
