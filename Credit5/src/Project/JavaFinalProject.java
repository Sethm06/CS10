/*

Program: JavaFinalProject       Date:05/05/2022


Author: Seth Mckenzie 
School: CHHS
Course: Computer Science 10
 
*/

package Project;

import java.util.Scanner;

public class JavaFinalProject
{

  public static void main(String[] args) 
  {
	 
	String truePassword = null; 
	 
	//scanner make a password
	Scanner askYN1 = new Scanner(System.in);
	System.out.println("Want to create a password? (y/n): ");
	String YN1 = askYN1.next();
	
	while(YN1.equals("y") || YN1.equals("Y"))
	{
			  //scanner create password
			  Scanner askPassword = new Scanner(System.in);
			  System.out.println("Create a numerical password with more than 4 digits: ");
			  String password = askPassword.next();
			  
			  while(password.length() < 4)
			  {
				  System.out.println("Please re-enter password with more than 4 digits: ");
				  password = askPassword.next();
			  }
			  
			  while(password.length() >= 4)
			  {
				  //scanner confirm password
				  Scanner askPasswordAgain = new Scanner(System.in);
				  System.out.println("Type in your password again to confirm: ");
				  String passwordAgain = askPasswordAgain.next();
				  
				  //do the passwords match?
				  if(password.equals(passwordAgain))//passwords match
				  {
					//save password
					System.out.println("Passwords match, saving password.");
					truePassword = password;
					
					//scanner type name
					Scanner askName = new Scanner(System.in);
					System.out.println("Type in your name: ");
					String name = askName.next();
					
					//scanner access profile?					
					Scanner askYN2 = new Scanner(System.in);
					System.out.println("Want to access your profile? (y/n): ");
					String YN2 = askYN2.next();
					
					//access profile
					while(YN2.equals("y") || YN1.equals("Y"))
					{
						
						//scanner type in password?					
						Scanner askTypePassword = new Scanner(System.in);
						System.out.println("Type in you password: ");
						String typePassword = askTypePassword.next();
						
							while(typePassword.equals(truePassword))
							{
								System.out.println("Welcome to your profile!");
								System.out.println("Your name is " + name);
								
								//scanner close account?
								Scanner askYN3 = new Scanner(System.in);
								System.out.println("Want to create a sign out of your account? (y): ");
								String YN3 = askYN3.next();
								
								if(YN3.equals("y") || YN3.equals("Y"))
								{
									System.out.println("Thank you for using this program!");
									System.exit(0);
								}

								
							}
							
							while(!typePassword.equals(truePassword))
							{
								System.out.println("Wrong password, access to profile denied.");
								System.out.println("Type in you password: ");
								typePassword = askTypePassword.next();
							}
						
					}
					  
				  }
				  if(!password.equals(passwordAgain))//passwords don't match
				  {
					  System.out.println("Wrong, passwords do not match.");
					  System.out.println("Please re-enter password with more than 4 digits: ");
					  password = askPassword.next();
				  }
			  }
	}
	if(YN1.equals("n") || YN1.equals("N"))
	{
		System.out.println("Thank you for using this program!");
		System.exit(0);

	}
	  
	  
	  
  }
  
}



/* Screen Dump





*/