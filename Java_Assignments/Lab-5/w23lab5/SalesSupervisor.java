package w23lab5;

/**
 * File name: Username.java 
 *  Author: Afnan Islam
 *  Course: CST8284
 *  Assignment: lab5
 *  Date:2023-03-16
 *  Professor:HESHAM SAADAWI
 *  Purpose: We are going use the concept of inheritance by creating a parent class call sales agent.
 *  And child classes will be sale supervisor and sales chief. both child going to inherit from the super
 *  class SalesAgent
 *  In this class we created a sales Supervisor who is also an agent but has his unique identities as well. It inherits the quality of a sales 
 * agent as well.
 * @author afnan 
 * @version 5.1
 * @since Javac 17.0.4.1
 */

public class SalesSupervisor extends SalesAgent {
	 /**
	    * A text variable to present the location of a sales supervisor
	    */
	protected  String location;
	
	/**
	 * A parameterized constructor to set the name and age for sales supervisor
	 * @param name sets the name for a sales supervisor
	 * @param age sets the age of a sales supervisor
	 * @param location sets the location for a sales supervisor
	 */

	public SalesSupervisor(String name, int age, String location) {
		super(name, age);
		this.location = location;
	}
	
	
	@Override
	public String toString() {  
	      return "Sales Supervisor [super= " + super.toString()+",location="+location+"]";

	}
	
	
	
	
	
	

	

}
