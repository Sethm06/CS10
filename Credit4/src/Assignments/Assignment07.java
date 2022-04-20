/*

Program: Assignment07         Date: 13/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment07 
{

  public static void main(String[] args) 
  	{
	   
	  //scan
	  
	  Scanner askPrice = new Scanner(System.in);
	  System.out.println("Enter the change in cents:");
	  double totalPrice = askPrice.nextDouble();   
	  
	  
	  //calculate quarters
	  
	  int NumberOfQuarters = (int)(totalPrice/25);
	  totalPrice = totalPrice - 25 * NumberOfQuarters;
	  System.out.println("Quarters: " + NumberOfQuarters);
	  
	  
	  //calculate dimes
	  
	  int NumberOfDimes = (int)(totalPrice/10);
	  totalPrice = totalPrice - 10 * NumberOfDimes;
	  System.out.println("Dimes: " + NumberOfDimes);
	  
	  
	  //calculate nickels
	  
	  int NumberOfNickels = (int)(totalPrice/5);
	  totalPrice = totalPrice - 5 * NumberOfNickels;
	  System.out.println("Nickels: " + NumberOfNickels);

	  
	  //calculate pennies
	  
	  int NumberOfPennies = (int)(totalPrice/1);
	  totalPrice = totalPrice - 1 * NumberOfPennies;
	  System.out.println("Pennies: " + NumberOfPennies);
	  
  	} 

}



/* Screen Dump


Enter the change in cents:
100
Quarters: 4
Dimes: 0
Nickels: 0
Pennies: 0


*/