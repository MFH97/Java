// Read in the length and the width of a rectangle.
// - Compute and display its area and its perimeter
//
// File name: Rectangle_1.java

import java.util.Scanner;

class Rectangle_1
{
	public static void main (String [ ] args)
	{
		// Define a Scanner class object
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		int length;
		int width;
		
		// Read in the length and the width of a rectangle
		System.out.print ("Enter the length and the width of a rectangle: ");
		length = input.nextInt ();
		width = input.nextInt ();
		
		// Compute its area and its perimeter
		int area = length * width;
		int perimeter = 2 * (length + width);
		
		// Display rectangle info
		System.out.println (); //creates a spacing before the next println
		System.out.println ("Rectangle info:");
		System.out.println ("\tLength = " + length);
		System.out.println ("\tWidth = " + width);
		System.out.println ("\tArea = " + area);
		System.out.println ("\tPerimeter = " + perimeter);
	}
}
