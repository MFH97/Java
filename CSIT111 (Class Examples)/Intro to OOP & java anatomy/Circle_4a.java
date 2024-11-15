// Given a radius of a circle, we wish to compute and display
// its area and its perimeter
//
// File name: Circle_4a.java
//
// Note the use of static import
// - More on static import

/*If you overuse the static import feature, 
it can make your program unreadable and unmaintainable, 
polluting its namespace with all the static members you import
*/


import static java.lang.Math.*;
import static java.lang.System.*;

class Circle_4a
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
		out.print ("Given radius = ");
		out.println (radius);
		
		out.print ("Its area is ");
		out.println (area);
		
		out.print ("Its perimeter is ");
		out.println (perimeter);
	}
}
