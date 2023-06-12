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
 *  class SalesAgent.
 * 
 *In this class we are setting the general attribute of every sales agent by creating some common information
 *for sales agent that every agents will have.
 * @author afnan 
 * @version 5.1
 * @since Javac 17.0.4.1
 */

// This is CST 8284 Lab 5. Follow all instructions stated in your Lab slides carefully.
// Include all the items required in this class.

/**
   This class shows a Sales Agent with a name and age.
*/
public class SalesAgent
{  
  /**
   * A text variable to present the name of a sales agent
   */
   protected String name;
   /**
    * A Numeric variable to present the age of a sales agent
    */
   protected int age;
/**
 * A parameterized constructor to set the name and age for sales agent
 * @param name sets the name for a sales agent
 * @param age sets the age of a sales agent
 */
  public SalesAgent(String name,int age) {
	  this.name= name;
	  this.age= age;  
  }
  

   /**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
   */

   public String toString()
   {  
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }
   
  
  





}