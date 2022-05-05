/*

Program: Assignment12        Date:27/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment12
{

  public static void main(String[] args) 
  {
	  
	  //scanner
	  Scanner askGradePerc = new Scanner(System.in);
	  System.out.println("Enter a grade percentage: ");
	  
	  //calculate grade
	  int gradePerc = askGradePerc.nextInt();;
	  String gradeFin = "";
	  
	  if (gradePerc >= 90 && gradePerc <= 100) 
	  {
		  gradeFin = "A+";
	  }
	  else if (gradePerc >= 80 && gradePerc <= 89) 
	  {
		  gradeFin = "A";
	  }
	  else if (gradePerc >= 75 && gradePerc <= 79) 
	  {
		  gradeFin = "B+";
	  }
	  else if (gradePerc >= 70 && gradePerc <= 74) 
	  {
		  gradeFin = "B";
	  }
	  else if (gradePerc >= 65 && gradePerc <= 69) 
	  {
		  gradeFin = "C+";
	  }
	  else if (gradePerc >= 60 && gradePerc <= 64) 
	  {
		  gradeFin = "C";
	  }
	  else if (gradePerc >= 55 && gradePerc <= 59) 
	  {
		  gradeFin = "D+";
	  }
	  else if (gradePerc >= 50 && gradePerc <= 54) 
	  {
		  gradeFin = "D";
	  }
	  else if (gradePerc < 50)
	  {
		  gradeFin = "F";
	  }
	  
	  
	  //print data
	  System.out.println("The corresponding letter grade is: " + gradeFin);

  }
  
}



/* Screen Dump


Enter a grade percentage: 
95
The corresponding letter grade is: A+


*/