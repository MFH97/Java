// Read in two sets of triangle 
// We wish to compute and display area and perimeter
//
// File name: Triangle_4.java
//
// We wish to have a table for the output
//
//		No       a            b            c            Area         Perimeter
//      ------------------------------------------------------------------
//      1        **.***    **.***   **.***     **.***      **.***
//      2        **.***    **.***   **.***     **.***      **.***
//      ------------------------------------------------------------------


import java.util.Scanner;

class Triangle_4
{
	private static final String LINE = "----------" + "----------" + "----------" + "----------" + "----------"+ "-----" ;
	private static final char TAB = '\t';
	
	public static void main (String [ ] args)
	{
		//declare variables
		double a1, a2;
		double b1, b2;
		double c1, c2;
		double area1, area2;
		double perimeter1, perimeter2;
		
		//construct a scanner class object input
		Scanner input = new Scanner(System.in);
		
		//read in the 3 sides of the triangle
		System.out.print("Enter the 3 sides: ");
		a1 = input.nextDouble();
		b1 = input.nextDouble();
		c1 = input.nextDouble();
		
		//compute info
		double s = (a1 + b1 + c1) / 2.0;
		area1 = Math.sqrt(s*(s-a1)*(s-b1)*(s-c1));
		perimeter1 = a1 + b1 + c1;
		
		// To get rid of input buffer means read and discard
		input.nextLine();		
		
		//read in the 3 sides of the triangle
		System.out.print("Enter the 3 sides: ");
		a2 = input.nextDouble();
		b2 = input.nextDouble();
		c2 = input.nextDouble();
		
		//compute info
		s = (a2 + b2 + c2) / 2.0;
		area2 = Math.sqrt(s*(s-a2)*(s-b2)*(s-c2));
		perimeter2 = a2 + b2 + c2;
		
		//display the table
		System.out.println();
		System.out.printf("%-5s" + "%-10s" + "%-10s" + "%-10s" + "%-10s" + "%-10s%n",
		                            "No", "a", "b", "c", "area", "perimeter") ;
		System.out.println(LINE);
		
		System.out.printf("%-5s" + "%-10.3f" + "%-10.3f" + "%-10.3f" + "%-10.3f" + "%-10.3f%n",
		                            "1", a1, b1, c1, area1, perimeter1) ;
									
		System.out.printf("%-5s" + "%-10.3f" + "%-10.3f" + "%-10.3f" + "%-10.3f" + "%-10.3f%n",
		                            "2", a2, b2, c2, area2, perimeter2) ;
		System.out.println(LINE);												
	}
}
