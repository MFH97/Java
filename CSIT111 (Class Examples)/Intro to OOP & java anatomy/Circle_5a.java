// Read in the value of a radius. Compute and display its
// area and its perimeter
//
// File name: Circle_5a.java
//
// Note the use of Scanner class defined in the utility package
//
// Note the use of  +, known as string concatenation inside the println method
// i.e. join them together

import java.util.Scanner;

class Circle_5a
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
		System.out.println ();
		System.out.println ("Circle infomation");
		System.out.println ("\tGiven radius = " + radius); //\t inserts a Tab character
		System.out.println ("\tIts area is " + area);
		System.out.println ("\tIts perimeter is " + perimeter);
	}
}
