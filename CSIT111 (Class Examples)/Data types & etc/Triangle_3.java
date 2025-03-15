// Read in two sets of triangle 
// We wish to compute and display area and perimeter
//
// File name: Triangle_3.java
//
// Explore static variables defined the class

import java.util.Scanner;

class Triangle_3
{
	//declare variables
		private static double a;
		private static double b;
		private static double c;
		
	private static final String LINE = "-----------------------------------------------------------";
	private static final char TAB = '\t';
	
	public static void main (String [ ] args)
	{
		
		double area;
		double perimeter;
		
		//construct a scanner class object input
		Scanner input = new Scanner(System.in);
		
		//read in the 3 sides of the triangle
		System.out.print("Enter the 3 sides: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//compute info
		double s = (a + b + c) / 2.0;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		perimeter = a + b + c;
		
		
		//minus means compiler left justify the output
		System.out.printf("%s%n", "\nTriangle Info");
		System.out.printf("%ca  = %-10.4f%n", TAB, a);
		System.out.printf("%cb = %-10.4f%n", TAB, b);
		System.out.printf("%cc = %-10.4f%n", TAB, c);
		System.out.printf("%carea  = %-10.4f%n", TAB, area);
		System.out.printf("%cperimeter  = %-10.4f%n", TAB, perimeter);
		
		System.out.println(LINE);
		
		// To get rid of input buffer means read and discard
		input.nextLine();		
		
		//read in the 3 sides of the triangle
		System.out.print("Enter the 3 sides: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//compute info
		s = (a + b + c) / 2.0;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		perimeter = a + b + c;
		
		
		//minus means compiler left justify the output
		System.out.printf("%s%n", "\nTriangle Info");
		System.out.printf("%ca  = %-10.4f%n", TAB, a);
		System.out.printf("%cb = %-10.4f%n", TAB, b);
		System.out.printf("%cc = %-10.4f%n", TAB, c);
		System.out.printf("%carea  = %-10.4f%n", TAB, area);
		System.out.printf("%cperimeter  = %-10.4f%n", TAB, perimeter);
	}
}
