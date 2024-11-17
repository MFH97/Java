// Read in the length and the width of a rectangle.
// - Compute and display its area and its perimeter
//
// File name: Rectangle_2.java
//
// Declaring variables inside the class
//  - static variables (avoid using)
/*  Using static variables reduces flexibility and extensibility because 
they are tied to the class itself rather than to instances. 
Static variables cannot be overridden or modified easily in subclasses, 
limiting the ability to extend classes in meaningful ways.
*/

import java.util.Scanner;

class Rectangle_2
{
	// Declare static variables inside the class
	// Always put public or private before the names
	// ==> they are usually private
	private static int length;
	private static	int width;
	
	public static void main (String [ ] args)
	{
		// Define a Scanner class object
		Scanner input = new Scanner (System.in);
	
		// Read in the length and the width of a rectangle
		System.out.print ("Enter the length and the width of a rectangle: ");
		length = input.nextInt ();
		width = input.nextInt ();
		
		// Compute its area and its perimeter
		int area = length * width;
		int perimeter = 2 * (length + width);
		
		// Display rectangle info
		System.out.println ();
		System.out.println ("Rectangle info");
		System.out.println ("\tLength = " + length);
		System.out.println ("\tWidth = " + width);
		System.out.println ("\tArea = " + area);
		System.out.println ("\tPerimeter = " + perimeter);
	}
}
