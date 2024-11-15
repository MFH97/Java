// Read in the value of a radius. Compute and display its
// area and its perimeter

// its area and its perimeter
//
// File name: Circle_5.java
//
// Note the use of Scanner class defined in the utility package

import java.util.Scanner;

class Circle_5
{
	public static void main (String [ ] args)
	{
		// Define a Scanner class object so that you can get information
		// from the keyboard input
		Scanner input = new Scanner (System.in);
		
		// Prompt the use to enter a radius
		System.out.print ("Enter a radius: ");
		double radius = input.nextDouble (); // user will enter a real number
		
		// Compute its area and its perimeter
		double area = Math.PI * radius * radius;
		double perimeter = 2.0 * Math.PI * radius;
		
		// Display the result
		System.out.print ("Given radius = ");
		System.out.println (radius);
		
		System.out.print ("Its area is ");
		System.out.println (area);
		
		System.out.print ("Its perimeter is ");
		System.out.println (perimeter);
	}
}
