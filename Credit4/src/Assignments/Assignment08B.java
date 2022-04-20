/*

Program: Assignment08B         Date:20/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment08B 
{

  public static void main(String[] args) 
  	{
	  
	  //scan
	  
	  Scanner askThreeDigit = new Scanner(System.in);
	  System.out.println("Enter a three digit number:");

	  //math
	  
	  int threeDigit = askThreeDigit.nextInt();
	  int ones=(threeDigit/1)%10;
	  int tens= (threeDigit/10)%10;
	  int hundreds= (threeDigit/100)%10;
	  
	  //print
	  
	  System.out.println("The hundreds-place digit is: " + hundreds);
	  System.out.println("The tens-place digit is: " + tens);
	  System.out.println("The ones-place digit is: " + ones);
	  
  	} 

}



/* Screen Dump


Enter a three digit number:
385
The hundreds-place digit is: 3
The tens-place digit is: 8
The ones-place digit is: 5


*/