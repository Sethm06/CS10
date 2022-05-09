/*

Program: JavaFinalProject       Date:09/05/2022


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
	 
	//set up variables
	String truePassword = null;
	String write = null;
	boolean inAccount = false; 

	 
	//scanner make a password
	Scanner askYN1 = new Scanner(System.in);
	System.out.println("Want to create a password? (y/n): ");
	String YN1 = askYN1.next();
	
	//user makes a password
	while(YN1.equals("y") || YN1.equals("Y"))
	{
			  //scanner create password
			  Scanner askPassword = new Scanner(System.in);
			  System.out.println("Create a password with more than 4 characters: ");
			  String password = askPassword.next();
			  
			  //password not long enough
			  while(password.length() < 4)
			  {
				  System.out.println("Please re-enter password with more than 4 characters: ");
				  password = askPassword.next();
			  }
			  
			  //password long enough
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
							
							//accessed account
							while(typePassword.equals(truePassword))
							{
								System.out.println("Welcome to your profile!");
								System.out.println("");
								System.out.println("Your name is " + name);
								System.out.println("");
								inAccount = true;
								
								//user is in account
								while(inAccount = true)
								{
									//what user can do in account
									System.out.println("Here are some things you can do in your account:");
									System.out.println("	- Addition\n	- Multiplication\n	- Writing");
	
									
									//scanner account tasks
									Scanner askTasks = new Scanner(System.in);
									System.out.println("What do you want to do? Type + for addition, * for multiplication, write for writing, and exit for logging out!");
									String tasks = askTasks.next();
									inAccount = false;
									
									//addition
									if (tasks.equals("+"))
									{
										//get random digits
										int addDigitOne = (int)(Math.random() * 100);
										int addDigitTwo = (int)(Math.random() * 100);
										
										//add digits
										int addSolution = addDigitOne + addDigitTwo;
										
										//scanner ask solution?					
										Scanner askAddSolutionInpt = new Scanner(System.in);
										System.out.println("What is the solution to " + addDigitOne + " + " + addDigitTwo + "?");
										int addSolutionInpt  = askAddSolutionInpt.nextInt();
										
										//solution correct
										if(addSolutionInpt == addSolution)
										{
											System.out.println("You got it right!");
											System.out.println("");
											inAccount = true;
										}
										
										//solution wrong
										else if(addSolutionInpt != addSolution)
										{
											System.out.println("You got it wrong!");
											System.out.println("");
											inAccount = true;
										}
									}
									
									//multiplication 
									if (tasks.equals("*"))
									{
										//get random digits
										int multiDigitOne = (int)(Math.random() * 20);
										int multiDigitTwo = (int)(Math.random() * 20);
										
										//multiply digits
										int multiProduct = multiDigitOne * multiDigitTwo;
										
										//scanner ask product?					
										Scanner askMultiProductInpt = new Scanner(System.in);
										System.out.println("What is the product to " + multiDigitOne + " * " + multiDigitTwo + "?");
										int multiProductInpt  = askMultiProductInpt.nextInt();
										
										//product correct
										if(multiProductInpt == multiProduct)
										{
											System.out.println("You got it right!");
											System.out.println("");
											inAccount = true;
										}
										
										//product wrong
										else if(multiProductInpt != multiProduct)
										{
											System.out.println("You got it wrong!");
											System.out.println("");
											inAccount = true;
										}
									}
									
									//writing 
									if(tasks.equals("write"))
									{	
										
										//is there is previous writing?
										if(write != null)
										{
											//scanner load previous writing?					
											Scanner askLoadWrite = new Scanner(System.in);
											System.out.println("Would you like to load your last writing? (y/n)");
											String loadWrite  = askLoadWrite.next();
											
											//load previous writing
											if(loadWrite.equals("y") || loadWrite.equals("Y"))
											{
												System.out.println(write);
												System.out.println("");
											}
											
											//don't load previous writing
											else if(loadWrite.equals("n") || loadWrite.equals("N"))
											{
												System.out.println("Ok.");
											}
										}
										
										//scanner write?					
										Scanner askWrite = new Scanner(System.in);
										System.out.println("Write what you want!");
										write  = askWrite.nextLine();
										
										System.out.println("Nice writing!");
										
										//scanner save writing?					
										Scanner askYN3 = new Scanner(System.in);
										System.out.println("Would you like to save it? (y/n)");
										String YN3  = askYN3.next();
											
											//save writing
											if(YN3.equals("y") || YN3.equals("Y"))
											{
												System.out.println("Writing saved!");
												System.out.println("");
												inAccount = true;
											}
											
											//don't save writing
											else if(YN3.equals("n") || YN3.equals("N"))
											{
												System.out.println("Writing not saved.");
												System.out.println("");
												write = null;
												inAccount = true;
											}

									}
									
									//log out
									if(tasks.equals("exit"))
									{
										System.out.println("Logging out...");
										System.out.println("Thank you for using this program!");
										System.exit(0);
									}
								}
							

								
							}
							
							//wrong password
							while(!typePassword.equals(truePassword))
							{
								System.out.println("Wrong password, access to profile denied.");
								System.out.println("Type in you password: ");
								typePassword = askTypePassword.next();
							}
						
					}
					
					//don't access profile
					while(YN2.equals("n") || YN1.equals("N"))
					{
						System.out.println("Thank you for using this program!");
						System.exit(0);
					}
					  
				  }
				  
				  //passwords don't match
				  if(!password.equals(passwordAgain))
				  {
					  System.out.println("Wrong, passwords do not match.");
					  System.out.println("Please re-enter password with more than 4 digits: ");
					  password = askPassword.next();
				  }
			  }
	}
	
	//user doesn't make password
	if(YN1.equals("n") || YN1.equals("N"))
	{
		System.out.println("Thank you for using this program!");
		System.exit(0);

	}
	  
	  
	  
  }
  
}



/* Screen Dump


Want to create a password? (y/n): 
y
Create a password with more than 4 characters: 
123
Please re-enter password with more than 4 characters: 
1234
Type in your password again to confirm: 
1234
Passwords match, saving password.
Type in your name: 
Seth McKenzie
Want to access your profile? (y/n): 
y
Type in you password: 
1234
Welcome to your profile!

Your name is Seth

Here are some things you can do in your account:
	- Addition
	- Multiplication
	- Writing
What do you want to do? Type + for addition, * for multiplication, write for writing, and exit for logging out!
+
What is the solution to 42 + 7?
49
You got it right!

Here are some things you can do in your account:
	- Addition
	- Multiplication
	- Writing
What do you want to do? Type + for addition, * for multiplication, write for writing, and exit for logging out!
*
What is the product to 2 * 5?
10
You got it right!

Here are some things you can do in your account:
	- Addition
	- Multiplication
	- Writing
What do you want to do? Type + for addition, * for multiplication, write for writing, and exit for logging out!
write
Write what you want!
Hello, my name is Seth and this is my java final project
Nice writing!
Would you like to save it? (y/n)
y
Writing saved!

Here are some things you can do in your account:
	- Addition
	- Multiplication
	- Writing
What do you want to do? Type + for addition, * for multiplication, write for writing, and exit for logging out!
write
Would you like to load your last writing? (y/n)
y
Hello, my name is Seth and this is my java final project

Write what you want!
Blah blah blah
Nice writing!
Would you like to save it? (y/n)
n
Writing not saved.

Here are some things you can do in your account:
	- Addition
	- Multiplication
	- Writing
What do you want to do? Type + for addition, * for multiplication, write for writing, and exit for logging out!
exit
Logging out...
Thank you for using this program!


*/