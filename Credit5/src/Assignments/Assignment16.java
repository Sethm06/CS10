/*

Program: Assignment16       Date:03/05/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment16
{

  public static void main(String[] args) 
  {
	  
	  //random secret number between 1 and 20
	  int secretNum = 1 + (int)(Math.random() * 20);
	  
	  //scanner
	  Scanner askPlayerNum = new Scanner(System.in);
	  System.out.println("Enter a number between 1 and 20: ");
	  int playerNum = askPlayerNum.nextInt();
	  
	  //compare secret number and players number
	  if(secretNum == playerNum)
	  {
		  System.out.println("You Won!");
	  }
	  else 
	  {
		  System.out.println("Better luck next time.");
	  }
	  
  }
  
}



/* Screen Dump


Enter a number between 1 and 20: 
2
You Won!


*/