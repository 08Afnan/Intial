package w23lab5;
/**
 * File name: Username.java 
 *  Author: Afnan Islam
 *  Course: CST8284
 *  Assignment: lab5
 *  Date:2023-03-16
 *  Professor:HESHAM SAADAWI
 *  Purpose:We are going use the concept of inheritance by creating a parent class call sales agent.
 *  And child classes will be sale supervisor and sales chief. both child going to inherit from the super
 *  class SalesAgent
 * In this class we test our sales agents class, to see if the inherited capabilities work well for all the sales agents(sales supervisor,
 * sales chief).
 * @author afnan 
 * @version 5.1
 * @since Javac 17.0.4.1
 *
 */



/**
   This program is the first test for the SalesAgent class including the subclass. Check the lab slides to ensure you include every item required.
*/
public class SalesAgentTest
{   
	/**
	 * 
	 * @param args creates objects to test the concept of polymorphism of class SalesAgent,
	 * SalesSupervisor, And SalesChief.
	 */
   public static void main(String[] args)
   {
	   
	   SalesAgent myAgent = new SalesAgent("Peter", 56);
	   SalesAgent myAgent2 = new SalesAgent("John", 48);
	   SalesSupervisor mySupervisor = new SalesSupervisor("Ifeoma", 53,"Toronto");
	   SalesChief myChief = new SalesChief("Afnan", 25, "Ottawa","Sales");
	   
	   System.out.println(myAgent.toString());
	   System.out.println(myAgent2.toString());
	   System.out.println(mySupervisor.toString());
	   System.out.println(myChief.toString());
	    
	   
	   SalesAgent myAgentt = new SalesAgent("Peter", 56);
	   System.out.println(myAgent.equals(myAgentt));
	   
	   SalesSupervisor mySupervisor2 = new SalesSupervisor("Ifeoma", 59,"Toronto");
	   System.out.println(mySupervisor.equals(mySupervisor2));
	  
   }
}  