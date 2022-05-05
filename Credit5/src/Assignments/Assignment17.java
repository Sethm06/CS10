/*

Program: Assignment17       Date:04/05/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment17
{

  public static void main(String[] args) 
  {
	  
	  //scanner
	  Scanner usinp = new Scanner(System.in);
	  
	  //Ask GPA
	  System.out.println("Please enter your Grade Point Average "
			  + "(enter -1 to quite program): ");
	  double gpa = usinp.nextDouble();
	  boolean programOFF = false;
	  
	  //Quit program?
	  while(gpa == -1) 
	  {
		  System.out.println("Closing program");
		  gpa = 0;
		  programOFF = true;
	  }
	  
	  //Calculate grade level
	  while(gpa != -1)
	  {
		  //Summa cum laude
		  if(gpa >= 3.8) 
		  {
			  //Print grade level
			  System.out.println("Summa cum laude");
			  gpa = 0;
			  
			  //Loop program?
			  System.out.println("Do you want to enter another Grade Point Average "
			  		+ "(press 1 for yes, press 2 for no)?");
			  gpa = usinp.nextInt();
			  
			  //Loop program
			  while(gpa == 1) 
			  {
				  System.out.println("Please enter your Grade Point Average "
						  + "(enter -1 to quite program): ");
				  gpa = usinp.nextDouble();
			  }
			  
			  //Quit program?
			  while(gpa == -1 || gpa == 2) 
			  {
				  System.out.println("Closing program");
				  gpa = 0;
				  programOFF = true;
			  }
		  }
		  
		  //Magna cum laude
		  else if(gpa >= 3.65 && gpa < 3.8) 
		  {
			  //Print grade level 
			  System.out.println("Magna cum laude");
			  gpa = 0;
			  
			  //Loop program?
			  System.out.println("Do you want to enter another Grade Point Average "
			  		+ "(press 1 for yes, press 2 for no)?");
			  gpa = usinp.nextInt();
			  
			  //Loop program
			  while(gpa == 1) 
			  {
				  System.out.println("Please enter your Grade Point Average "
						  + "(enter -1 to quite program): ");
				  gpa = usinp.nextDouble();
			  }
			  
			  //Quit program?
			  while(gpa == -1 || gpa == 2) 
			  {
				  System.out.println("Closing program");
				  gpa = 0;
				  programOFF = true;
			  }
		  }
		  
		  //Cum laude
		  else if(gpa >= 3.5 && gpa < 3.65) 
		  {
			  //Print grade level 
			  System.out.println("Cum laude");
			  gpa = 0;
			  
			  //Loop program?
			  System.out.println("Do you want to enter another Grade Point Average "
			  		+ "(press 1 for yes, press 2 for no)?");
			  gpa = usinp.nextInt();
			  
			  //Loop program
			  while(gpa == 1) 
			  {
				  System.out.println("Please enter your Grade Point Average "
						  + "(enter -1 to quite program): ");
				  gpa = usinp.nextDouble();
			  }
			  
			  //Quit program?
			  while(gpa == -1 || gpa == 2) 
			  {
				  System.out.println("Closing program");
				  gpa = 0;
				  programOFF = true;
			  }

		  }
		  
		  //No honors
		  else if(gpa < 3.5 && gpa > 0)
		  {
			  //Print grade level
			  System.out.println("Sorry, at this you did not "
			  		+ "qualify for an honors distinction.");
			  gpa = 0;
			  
			  //Loop program?
			  System.out.println("Do you want to enter another Grade Point Average "
			  		+ "(press 1 for yes, press 2 for no)?");
			  gpa = usinp.nextInt();
			  
			  //Loop program
			  while(gpa == 1) 
			  {
				  System.out.println("Please enter your Grade Point Average "
						  + "(enter -1 to quite program): ");
				  gpa = usinp.nextDouble();
			  }
			  
			  //Quit program?
			  while(gpa == -1 || gpa == 2) 
			  {
				  System.out.println("Closing program");
				  gpa = 0;
				  programOFF = true;
			  }

		  }
		  else if(programOFF = true)
		  {
			  System.out.println("Thank you for using our program, have a great day!");
			  gpa = 0;
			  programOFF = false;
			  System.exit(0);
		  }
	  }
	  
	 	  
	  
	  
	  
	  
	  
	  
	  
	  /*Scanner usinp = new Scanner(System.in);
	  
	  System.out.println("Please enter your name: ");
	  String usname = usinp.nextLine();
	  
	  //usinp.next();//flush the next.() method
	  System.out.println("Please enter your password that "
	  + "is at least 5 characters long: ");
	  String password = usinp.next();
	  
	  while(password.length() < 5)
	  {
		  System.out.println("Please re-enter a password "
		  + "that is 5 or more characters: ");
		  password = usinp.next();
	  }
	  
	  System.out.println("Your name is: " + usname);
	  System.out.println("Your password is: " + password);*/
	  
  }
  
}



/* Screen Dump





*/