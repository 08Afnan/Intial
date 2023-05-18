package Lab6;
// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!
/**
 * File name: Username.java
 *  Author: Afnan Islam
 *  Course: CST8284
 *  Assignment: lab6
 *  Date:2023-03-31
 *  Professor:HESHAM SAADAWI
 *  Purpose: We are going use the concept of interface and polymorphisom by creating an interface and a super class
 *  with few sub classes. We also implement the interface to see how how implements the method and use it to run print or check something.
 *
 *  This is the  class where we implement the interface
 * @version 6.1
 * @since Javac 17.0.4.1
 */
//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

public abstract class Programmer implements Payme  {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private int month;
	private int year;

	//three-argument constructor
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	//five argument constructor
	public Programmer(String first, String last, String ssn, int month, int year) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		this.setMonth(month);
		this.setYear(year);
	}

	/** CHANGES ARE REQUIRED IN THIS SECTION.
	 * THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
	 * IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
	 */


	//return String representation of Programmer object
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",
				getFirstName(), getLastName(), getSocialSecurityNumber());
	}


	//Note: We do NOT implement Payme method getPaymentAmount() here.
	// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the socialSecurityNumber
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * @param socialSecurityNumber the socialSecurityNumber to set
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * this is an unimplemented method
	 * @return doesn't return anything
	 */
	public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/

	@Override
	public abstract double getPaymentAmount();


}



