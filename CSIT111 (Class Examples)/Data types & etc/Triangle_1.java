// Get user to input values
//Read in the three sides of a triangle.
// Compute and display its area and its perimeter
//
// File name: Triangle_1.java

import java.util.Scanner;
class Triangle_1
{
	public static void main (String [ ] args)
	{
		//declare variables
		double a;
		double b;
		double c;
		double area;
		double perimeter;
		
		//construct a scanner class object input
		Scanner input = new Scanner(System.in);//input is the Scanner class object
		
		//read in the 3 sides of the triangle
		System.out.print("Enter the 3 sides: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c= input.nextDouble();
		
		//compute info
		double s = (a + b + c) / 2.0;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		perimeter = a + b + c;
		
		//display info
		System.out.println("\nTriangle Info");
		System.out.println("\ta  = " + a);
		System.out.println("\tb = " + b);
		System.out.println("\tc = " + c);
		System.out.println("\tarea  = " + area);
		System.out.println("\tperimeter  = " + perimeter);
	}
}
