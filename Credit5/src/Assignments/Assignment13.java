/*

Program: Assignment13        Date:29/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment13
{

  public static void main(String[] args) 
  {
	  
	  //scanner
	  Scanner askNumCopies = new Scanner(System.in);
	  System.out.println("Enter the number of copies to be printed: ");
	  
	  //record variables
	  int numCopies = askNumCopies.nextInt();
	  double pricePerCopy = 0;
	  
	  //calculate price per copy
	  if (numCopies >= 0 && numCopies <= 99) 
	  {
		 pricePerCopy = 0.30; 
	  }
	  else if (numCopies >= 100 && numCopies <= 499) 
	  {
		 pricePerCopy = 0.28; 
	  }
	  else if (numCopies >= 500 && numCopies <= 749) 
	  {
		 pricePerCopy = 0.27; 
	  }
	  else if (numCopies >= 750 && numCopies <= 1000) 
	  {
		 pricePerCopy = 0.26; 
	  }
	  else if (numCopies > 1000) 
	  {
		 pricePerCopy = 0.25; 
	  }
	  
	  //calculate final price
	  double finalPrice = numCopies * pricePerCopy;
	  
	  //print data
	  System.out.println("Price per copy is: $" + pricePerCopy);
	  System.out.println("Total cost is: $" + finalPrice);
	    

  }
  
}



/* Screen Dump


Enter the number of copies to be printed: 
1001
Price per copy is: $0.25
Total cost is: $250.25


*/