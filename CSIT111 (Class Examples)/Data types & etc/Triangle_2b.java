// Read in the three sides of a triangle.
// We wish to compute and display its area and its perimeter
// Explore the use of printf methods
// File name: Triangle_2b.java


import java.util.Scanner;

class Triangle_2b
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
		
		//display info (compiler right justify the output)
		System.out.println("\nTriangle Info");
		System.out.printf("\ta  = %.0f%n", a);//%.0f = 0(no)decimal place(float)
		System.out.printf("\tb = %2.1f%n", b);//%2.1f = 1dp
		System.out.printf("\tc = %4.2f%n", c);//%4 = characters in width padded space
		System.out.printf("\tarea  = %6.4f%n", area);
		System.out.printf("\tperimeter  = %10f%n", perimeter);//%f  folat = default 6dp
    }
}
