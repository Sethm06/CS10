/*

Program: Assignment14        Date:29/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment14
{

  public static void main(String[] args) 
  {
	  
	  //scanner
	  Scanner askAge = new Scanner(System.in);
	  System.out.println("Enter age: ");
	  
	  //record variables
	  int age = askAge.nextInt();
	  String ageGroup = "";
	  
	  //calculate price per copy
	  if (age <= 5) 
	  {
		  ageGroup = "Toddler"; 
	  }
	  else if (age <= 10) 
	  {
		  ageGroup = "Child"; 
	  }
	  else if (age <= 12) 
	  {
		  ageGroup = "Preteen"; 
	  }
	  else if (age > 12 && age < 18) 
	  {
		  ageGroup = "Teen"; 
	  }
	  else if (age >= 18) 
	  {
		  ageGroup = "Adult";
	  }

	  //print data
	  System.out.println("Your age group is: " + ageGroup);


  }
  
}



/* Screen Dump


Enter age: 
20
Your age group is: Adult


*/