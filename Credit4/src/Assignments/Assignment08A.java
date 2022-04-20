/*

Program: Assignment08A         Date:20/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment08A 
{

  public static void main(String[] args) 
  	{
	  
	  //scan
	  
	  Scanner askTwoDigit = new Scanner(System.in);
	  System.out.println("Enter a two digit number:");

	  //math
	  
	  int twoDigit = askTwoDigit.nextInt();
	  int ones=(twoDigit/1)%10;
	  int tens= (twoDigit/10)%10;
	  
	  //print
	  
	  System.out.println("The tens-place digit is: " + tens);
	  System.out.println("The ones-place digit is: " + ones);
	  
  	} 

}



/* Screen Dump


Enter a two digit number:
57
The tens-place digit is: 5
The ones-place digit is: 7


*/