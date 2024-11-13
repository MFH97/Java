// Given a radius of a circle, we wish to compute and display
// its area and its perimeter
//
// File name: Circle_3b.java
//
// Note the use of random method in the Math class
//  - random method will generate a value in beween 0 and 1
// This example shows how to generate a range of other values

class Circle_3b
{
	public static void main (String [ ] args)
	{
		// Declare and initialize the radius to a random value
		// The random value is between 0 and 100
		double radius = Math.random () * 100.0;
		
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
