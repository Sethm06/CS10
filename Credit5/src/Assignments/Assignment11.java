/*

Program: Assignment11        Date:25/04/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment11
{

  public static void main(String[] args) 
  {
	  
	  //scanner
	  Scanner askThreeDigit = new Scanner(System.in);
	  System.out.println("Please enter any three digits: ");
	  
	  //record variables
	  int threeDigit = askThreeDigit.nextInt();
	  int ones=(threeDigit/1)%10;
	  int tens= (threeDigit/10)%10;
	  int hundreds= (threeDigit/100)%10;
	  int min = 0;
	  int max = 0;
	  
	  //calculate min
	  	if (ones < tens && ones < hundreds) //min = ones?
	  	{
	  		min = ones;
	  	}
	  	else if (tens < ones && tens < hundreds) //min = tens?
	  	{
	  		min = tens;
	  	}
	  	else if (hundreds < ones && hundreds < tens) //min = hundreds?
	  	{
	  		min = hundreds;
	  	}
	  		
	  		
	  //calculate  max 	
		if (ones > tens && ones > hundreds) //max = ones?
		{
				max = ones;
			
		}
		else if (tens > ones && tens > hundreds) //max = tens?
		{
				max = tens;
		}
		else if (hundreds > ones && hundreds > tens) //max = hundreds?
		{
				max = hundreds;
		}
			  
//print data		
System.out.println("The largest of the three digits is: " + max);
System.out.println("The smallest of the three digits is: " + min);
System.out.println("The sum of the three digits is: " + (ones + tens + hundreds));
System.out.println("The product of the three digits is: " + (ones * tens * hundreds));
System.out.println("The average of the three digits is: " + ((ones + tens + hundreds)/3));

	 


  }
  
}



/* Screen Dump


Please enter any three digits: 
569
The largest of the three digits is: 9
The smallest of the three digits is: 5
The sum of the three digits is: 20
The product of the three digits is: 270
The average of the three digits is: 6


*/