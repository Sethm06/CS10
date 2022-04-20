/*

Program: Assignment06         Date: 12/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment06 
{

  public static void main(String[] args) 
  	{
	   
	  Scanner scan = new Scanner(System.in);
	  System.out.println("What is your first name?");
	  String firstName = scan.next();
	  
	  System.out.println("What is your last name?");
	  String lastName = scan.next();
	  
	  System.out.println("What grade are you in?");
	  String grade = scan.next();
	  
	  System.out.println("What school do you attend?");
	  String school = scan.next();
	  
	  System.out.println("What is your favourite hobby?");
	  String hobby = scan.next();
	  
	  System.out.println("Hello, your name is " + firstName + " " + lastName + ", you are currently in grade " + grade + " at " + school + ". Your favourite hobby is " + hobby + ".");

    	
  	} 

}



/* Screen Dump


What is your first name?
Seth
What is your last name?
McKenzie
What grade are you in?
10
What school do you attend?
CHHS
What is your favourite hobby?
Reading
Hello, your name is Seth McKenzie, you are currently in grade 10 at CHHS. Your favourite hobby is Reading.


*/