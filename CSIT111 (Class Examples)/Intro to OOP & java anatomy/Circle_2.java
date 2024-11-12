// Given a radius of a circle, we wish to compute and display
// its area and its perimeter
//
// File name: Circle_2.java
//
// Note the declaration of constant inside the main method

class Circle_2
{
	public static void main (String [ ] args)
	{
		// Declare a constant pi
		final double PI = 3.14159256;
		
		// Declare and initialize the radius
		double radius = 12.456;
		
		// Compute its area and its perimeter
		double area = PI * radius * radius;
		double perimeter = 2.0 * PI * radius;
		
		// Display the result
		System.out.print ("Given radius = ");
		System.out.println (radius);
		
		System.out.print ("Its area is ");
		System.out.println (area);
		
		System.out.print ("Its perimeter is ");
		System.out.println (perimeter);
	}
}
