/*

Program: Assignment09         Date:20/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment09
{

  public static void main(String[] args) 
  	{
	   
	  //scanners
	  
	  Scanner askIntegerOne = new Scanner(System.in);
	  System.out.println("Enter an integer:");
	  int integerOne = askIntegerOne.nextInt();
	  
	  Scanner askIntegerTwo = new Scanner(System.in);
	  System.out.println("Enter a second integer:");
	  int integerTwo = askIntegerTwo.nextInt();
	  
	  //integer div
	  
	  int intDivOne = integerOne / integerTwo; 
	  int intDivTwo = integerTwo / integerOne;
	  
	  //modulus div
	  
	  int modDivOne = integerOne % integerTwo;
	  int modDivTwo = integerTwo % integerOne;
	  
	  //print
	  
	  System.out.println("");
	  System.out.println(integerOne + " / " + integerTwo + " = " + intDivOne);
	  System.out.println(integerOne + " % " + integerTwo + " = " + modDivOne);
	  System.out.println("");
	  System.out.println(integerTwo + " / " + integerOne + " = " + intDivTwo);
	  System.out.println(integerTwo + " % " + integerOne + " = " + modDivTwo);

  	} 

}



/* Screen Dump


Enter an integer:
14
Enter a second integer:
4

14 / 4 = 3
14 % 4 = 2

4 / 14 = 0
4 % 14 = 4


*/