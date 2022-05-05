/*

Program: Assignment15        Date:03/05/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment15
{

  public static void main(String[] args) 
  {
	  
	  //random numbers between 1 and 10
	  int firstNum = 1 + (int)(Math.random() * 10);
	  int secondNum = 1 + (int)(Math.random() * 10);
	  
	  //record product
	  int product = firstNum * secondNum; 
	  
	  //scanner
	  Scanner askProductScan = new Scanner(System.in);
	  System.out.println("What is " + firstNum + " * " + secondNum + "?");
	  int askProduct = askProductScan.nextInt();

	  //calculate if solution is the correct product
	  if(askProduct == product) 
	  {
		  System.out.println("You got it right! Congratulations!!");
	  }
	  else
	  {
		  System.out.println("Sorry, that answer is wrong.");
	  }

  }
  
}



/* Screen Dump


What is 3 * 5?
15
You got it right! Congratulations!!


*/