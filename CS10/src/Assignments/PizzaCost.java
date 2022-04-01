/*

Program: PizzaCost          Date: 31/03/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 

*/



package Assignments;


import java.util.*;

public class PizzaCost 
{

  public static void main(String[] args) 
  	{
	   
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the diameter of the pizza in inches:");
	  	    
	    double diameter = myObj.nextDouble();    
	    
	    System.out.println("The cost of making the pizza is: " + "$" + (diameter * 0.5 * 0.5 + 1 + 0.75));  // Output user input
	    
	 }
  
}
/* Screen Dump

	
Enter the diameter of the pizza in inches:
1
The cost of making the pizza is: $2.0


*/