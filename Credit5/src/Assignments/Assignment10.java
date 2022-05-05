/*

Program: Assignment10        Date:22/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment10
{

  public static void main(String[] args) 
  {
	  
	  //scanner
	  Scanner askNum = new Scanner(System.in);
	  System.out.println("Enter an integer: ");
	  
	  //record integer
	  int num = askNum.nextInt();
	  
	  //record even or odd
	  if(num % 2 == 0)
	  {
		  System.out.println("The integer " + num + " is even.");
	  }
	  else
	  {
		  System.out.println("The integer " + num + " is odd.");
	  }
  	} 

}



/* Screen Dump


Enter an integer: 
15
The integer 15 is odd.


*/