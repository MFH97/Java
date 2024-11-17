// The use of division (/) and the modulus (%) operators
//
// File name: TestOperators.java

class TestOperators
{
	public static void main (String [ ] args)
	{
    //Declare and initialize an integer variable
		int n = 1234;
		
		// How to get the last digit of n?
		int lastDigit = n % 10;
		System.out.println ("The last digit of " + n + " is " + lastDigit);
		
		// How to get the last two digits of n?
		int last2Digits = n % 100;
		System.out.println ("The last two digits of " + n + " are " + last2Digits);
		
		// How to remove the last digit of n?
		System.out.print ("After removing the last digit of " + n);
		
		n = n / 10;		// integer division
		
		System.out.println (", the new integer is " + n);
	}
}
