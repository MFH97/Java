// How to swap two information?
//
// File name: TestSwaps.java

class TestSwaps
{
	public static void main (String [ ] args)
	{
		int x = 123;
		int y = 456;
		
		System.out.println ("Before the swaps");
		System.out.println ("\tx = " + x);
		System.out.println ("\ty = " + y);
		
		
		// This will give x and y the same values 456
		x = y;
		y = x;
		
		System.out.println ("\nAfter the swaps");
		System.out.println ("\tx = " + x);
		System.out.println ("\ty = " + y);
	}
}
