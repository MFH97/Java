// Read in the three sides of a triangle.
// We wish to compute and display its area and its perimeter
// Explore the use of printf methods
// File name: Triangle_2a.java


import java.util.Scanner;

class Triangle_2a
{
    public static void main (String [] args)
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
        System.out.print("Enter 3 sides of Triangle: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        //compute info
        double s = (a + b + c) / 2.0;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		perimeter = a + b + c;
		
		//display info
		System.out.println("\nTriangle Info");// \n = Start at newline, then print
		System.out.printf("\ta = %.4f%n", a);// \t = insert a tab space
		System.out.printf("\tb = %.4f%n", b);// %.4 = format to 4dp
		System.out.printf("\tc = %.4f%n", c);// %n = newline character
		System.out.printf("\tarea  = %.4f%n", area);
		System.out.printf("\tperimeter  = %.4f%n", perimeter);
    }
}
