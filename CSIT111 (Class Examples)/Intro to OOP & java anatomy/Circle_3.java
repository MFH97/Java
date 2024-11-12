// Given a radius of a circle, we wish to compute and display
// its area and its perimeter
//
// File name: Circle_3.java
//
// Note the use of Math class i.e. the use of PI

class Circle_3
{
	public static void main (String [ ] args)
	{
		// Declare and initialize the radius
		double radius = 12.456;
		
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
