package w23lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * File name: Username.java 
 *  Author: Afnan Islam
 *  Course: CST8284
 *  Assignment: lab5
 *  Date:2023-03-16
 *  Professor:HESHAM SAADAWI
 *  Purpose:We are going use the concept of Polymorphism to create and show the sales agents with different ages.
 *  
 * In this class we used a loop and an array of sales agents to show the how we can create sales agent with
 * different number, where maximum is 100 and minimum is 4. Also used math.random to set the 
 * range of age for a sales agent from 18 to 100.
 * @author afnan 
 * @version 5.1
 * @since Javac 17.0.4.1
 */


/**
   This program is the tests for the SalesAgent class including the subclasses.
*/
public class SalesAgentTest2
{  
	/**
	 * A Numeric constant  to present the maximum number of sales agent 
	 */
	public static final int MAXIMUM= 100;

	 
	/**
	 * 
	 * @param args creates objects to test the concept of polymorphism of class SalesAgent,
	 * SalesSupervisor, And SalesChief.
	 */
	
   public static void main(String[] args)
   {

	   SalesAgent myAgent;
	   SalesAgent myAgent2;
	   SalesSupervisor mySupervisor;
	   SalesChief myChief;
	   
		Scanner scanner = new Scanner (System.in);
		int numberOfAgents;
		
		System.out.println("Enter number of agents between 4 and 100 (multiples of 4): ");
		numberOfAgents = scanner.nextInt();
		
		while (numberOfAgents > MAXIMUM || numberOfAgents < 4) {
			System.out.println("Max is 100, min is 4, try again: ");
			numberOfAgents = scanner.nextInt();
		}
		
		int numLoop = numberOfAgents/4;
		

	   
	  //loop defining array of sales agents
		
		ArrayList<SalesAgent> agents = new ArrayList<SalesAgent>();
		//loop sets sells agent with random age with maximum age 100 and minimum age 18 for an agent
		for (int i = 0; i < numLoop; i++) {
			int age = (int) (Math.random() * (100 - 18)) + 18; 
			myAgent = new SalesAgent("Peter", age);
			  
			age = (int) (Math.random() * (100 - 18)) + 18;
			myAgent2 = new SalesAgent("John", age);
			   
			age = (int) (Math.random() * (100 - 18)) + 18;
			mySupervisor = new SalesSupervisor("Ifeoma", age,"Toronto");
			   
			age = (int) (Math.random() * (100 - 18)) + 18;
			myChief = new SalesChief("Afnan", age, "Ottawa","Sales");
			
			agents.add(myAgent);
			agents.add(myAgent2);
			agents.add(mySupervisor);
			agents.add(myChief);			
		}
		
	//creating another for loop to check if the overriden method for each class work with matching implementation
		for (SalesAgent s: agents) {
		      System.out.println(s.toString());
		    }
		scanner.close();
   }
  
}  