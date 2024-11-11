// Given a radius of a circle, we wish to compute and display
// its area and its perimeter
//
// File name: Circle_1.java

class Circle_1
{
	public static void main (String [ ] args)
	{
		// Declare and initialize the radius
		double radius = 12.456;
		
		// Compute its area and its perimeter
		double area = 3.14156 * radius * radius;
		double perimeter = 2.0 * 3.14156 * radius;
		
		// Display the result
		System.out.print ("Given radius = ");
		System.out.println (radius);
		
		System.out.print ("Its area is ");
		System.out.println (area);
		
		System.out.print ("Its perimeter is ");
		System.out.println (perimeter);
	}
}
