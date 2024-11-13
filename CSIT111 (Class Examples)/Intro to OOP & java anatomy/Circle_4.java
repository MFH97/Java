// Given a radius of a circle, we wish to compute and display
// its area and its perimeter
//
// File name: Circle_4.java
//
// Note the use of static import
// Which imports all static members of the java.lang.math class,
// Therefore, PI & random() methods can be used without the Math prefix

import static java.lang.Math.*;

class Circle_4
{
	public static void main (String [ ] args)
	{
		// Declare and initialize the radius to a random value
		// The random value is between 0 and 100
		double radius = random () * 100.0;
		
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
