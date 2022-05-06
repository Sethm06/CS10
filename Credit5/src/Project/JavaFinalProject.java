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
	String write = null;
	boolean inAccount = false; 

	 
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
							
							//accessed account
							while(typePassword.equals(truePassword))
							{
								System.out.println("Welcome to your profile!");
								System.out.println("");
								System.out.println("Your name is " + name);
								System.out.println("");
								inAccount = true;
								
								while(inAccount = true)
								{
									System.out.println("Here are some things you can do in your account:");
									System.out.println("	- Addition\n	- Multiplacation\n	- Writing");
	
									
									//scanner account tasks
									Scanner askTasks = new Scanner(System.in);
									System.out.println("What do you want to do? Type + for addition, * for multiplacation, write for writing, and  log out for logging out!");
									String tasks = askTasks.next();
									inAccount = false;
									
									//addition
									if (tasks.equals("+"))
									{
										int addDigitOne = (int)(Math.random() * 100);
										int addDigitTwo = (int)(Math.random() * 100);
										
										int addSolution = addDigitOne + addDigitTwo;
										
										//scanner ask solution?					
										Scanner askAddSolutionInpt = new Scanner(System.in);
										System.out.println("What is the solution to " + addDigitOne + " + " + addDigitTwo + "?");
										int addSolutionInpt  = askAddSolutionInpt.nextInt();
										
										if(addSolutionInpt == addSolution)
										{
											System.out.println("You got it right!");
											System.out.println("");
											inAccount = true;
										}
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
										int multiDigitOne = (int)(Math.random() * 20);
										int multiDigitTwo = (int)(Math.random() * 20);
										
										int multiProduct = multiDigitOne * multiDigitTwo;
										
										//scanner ask product?					
										Scanner askMultiProductInpt = new Scanner(System.in);
										System.out.println("What is the product to " + multiDigitOne + " * " + multiDigitTwo + "?");
										int multiProductInpt  = askMultiProductInpt.nextInt();
										
										if(multiProductInpt == multiProduct)
										{
											System.out.println("You got it right!");
											System.out.println("");
											inAccount = true;
										}
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
										
										if(write != null)
										{
											//scanner load last writing?					
											Scanner askLoadWrite = new Scanner(System.in);
											System.out.println("Would you like to load your last writing? (y/n)");
											String loadWrite  = askLoadWrite.next();
											
											if(loadWrite.equals("y") || loadWrite.equals("Y"))
											{
												System.out.println(write);
												System.out.println("");
											}
											else if(loadWrite.equals("n") || loadWrite.equals("N"))
											{
												System.out.println("Ok.");
											}
										}
										
										//scanner write?					
										Scanner askWrite = new Scanner(System.in);
										System.out.println("Write what you want!");
										write  = askWrite.next();
										
										System.out.println("Nice writing!");
										
										//scanner save writing?					
										Scanner askYN3 = new Scanner(System.in);
										System.out.println("Would you like to save it? (y/n)");
										String YN3  = askYN3.next();
										
										if(YN1.equals("y") || YN1.equals("Y"))
										{
											System.out.println("Saving...");
											System.out.println("Writing saved!");
											System.out.println("");
											inAccount = true;
										}
										if(YN1.equals("n") || YN1.equals("N"))
										{
											System.out.println("Writing not saved.");
											System.out.println("");
											write = null;
											inAccount = true;
										}
									}
									
									//log out
									else if(tasks.equals("log out"))
									{
										System.out.println("Thank you for using this program!");
										System.exit(0);
									}
								}
							

								
							}
							
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