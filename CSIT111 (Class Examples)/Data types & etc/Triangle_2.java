// Read in the three sides of a triangle.
// We wish to compute and display its area and its perimeter
// Explore the use of printf methods
// File name: Triangle_2.java



import java.util.Scanner;

class Triangle_2
{
	public static void main (String [ ] args)
	{
		//declare variables
		double a;
		double b;
		double c;
		double s;
		double area;
		double perimeter;
		
		//construct a scanner class object input
		
		Scanner input = new Scanner(System.in);
		
		//read in the 3 sides of the triangle
	    System.out.printf("Enter 3 sides of Triangle: ");
	    a = input.nextDouble();
	    b = input.nextDouble();
	    c = input.nextDouble();
		
		//compute info
	    s = (a+b+c) / 2.0;
	    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	    perimeter = a + b + c;
	    
		//display info
	    System.out.println("\nTriangle Info");
	    System.out.printf("\ta = %f%n", a);
	    System.out.printf("\tb = %f%n", b);
	    System.out.printf("\tc = %f%n", c);
	    System.out.printf("\tarea = %f%n", area);
	    System.out.printf("\tperimeter = %f%n", area);
	}
}
