//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;

	//write two constructors
	public Rational() {
		setRational(1,1);
	}
	public Rational(int num, int den) {
		setRational(num,den);
	}


	//write a setRational method
	public void setRational(int num, int den) {
		setnumerator(num);
		setdenominator(den);
	}

	//write  a set method for numerator and denominator
	public void setnumerator(int num) {
		numerator = num;
	}
	public void setdenominator(int den) {
		denominator = den;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int a = denominator * other.getdenominator();
		setnumerator((numerator * other.getdenominator()) +
				(other.getnumerator() * denominator));
		setdenominator(a);

		reduce();
	}

	private void reduce()
	{
		int maxgcd = gcd(numerator,denominator);
		setdenominator(denominator / maxgcd);
		setnumerator(numerator / maxgcd);


	}

	private int gcd(int numOne, int numTwo)
	{
		int maxgcd = 1;
		for (int i = 1; i <= numOne; i++) {
			if (numOne % i == 0 && numTwo % i == 0) maxgcd = i;
		}

		return maxgcd;
	}

	public Object clone ()
	{
		Rational frac = new Rational(numerator,denominator);
		return frac;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getnumerator() {
		return numerator;
	}
	public int getdenominator() {
		return denominator;
	}
	
	public boolean equals( Rational obj)
	{
		obj.reduce();
		reduce();
		if (obj.getdenominator() * numerator - obj.getnumerator() * denominator == 0) return true;


		return false;
	}

	public int compareTo(Rational other)
	{
		other.reduce();
		reduce();
		if (other.getdenominator() * numerator - other.getnumerator() * denominator == 0) return 0;
		else if (other.getdenominator() * numerator - other.getnumerator() * denominator < 0) return -1;
		else return 1;
	}



	
	//write  toString() method
	public String toString() {
		return "" + numerator + "/" + denominator;
	}
	
}