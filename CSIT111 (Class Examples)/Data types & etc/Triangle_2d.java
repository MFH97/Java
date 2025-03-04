// Read in the three sides of a triangle.
// We wish to compute and display its area and its perimeter
// Explore the use of printf methods
//Explore the use of Static variables
// File name: Triangle_2d.java


import java.util.Scanner;

class Triangle_2d
{   
    //declare a variable to hold \t Character
	private static final char TAB = '\t';
	
	public static void main (String [ ] args)
	{
		//declare variables
		double a;
		double b;
		double c;
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
		System.out.printf("\ta  = %-10.4f%n%s", a,"diff");//compare the difference in format
		System.out.printf("%ca = %-10.4f%n", TAB, a);
		
		System.out.printf("%cb = %-10.4f%n", TAB, b);
		System.out.printf("%cc = %-10.4f%n", TAB, c);
		System.out.printf("%carea  = %-10.4f%n", TAB, area);
		System.out.printf("%cperimeter  = %-10.4f%n", TAB, perimeter);
	}
}
