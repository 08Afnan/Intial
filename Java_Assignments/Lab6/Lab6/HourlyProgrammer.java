package Lab6;
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!
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
 *  This is the sub class where we calculate the hourly wages of a programmer also we create a new implementation for our payment due for a programmer
 *  who gets payment based on hourly rate.
 * @author afnan
 * @version 6.1
 * @since Javac 17.0.4.1
 */

// HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.

public class HourlyProgrammer extends Programmer {
	/**
	 * atributes for wage per hour
	 */
	private double wage;
	/**
	 * atributes worked for week
	 */
	private double hours;

	//constructor
	/**
	 *
	 * @param firstName sets the first name for a programmer
	 * @param lastName  sets the last name for a programmer
	 * @param socialSecurityNumber  sets the social Security Number for a programmer
	 * @param month sets the month to calculate the wage
	 * @param year  sets the month to calculate the wage
	 * @param wage  sets the wage to calculate the wage
	 * @param hours sets the hour to calculate the hourly rate
	 */
	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}
		/**
		 * set the attributes hour and wage to the wage and hour
		 */
		this.wage = wage;
		this.hours = hours;
	}

	//set wage
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}
		/**
		 *sets the wage attribute to wage
		 */
		this.wage = wage;
	}

	//return wage
	public double getWage() {
		return wage;
	}

	//set hours worked
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}
		/**
		 *sets the hour attribute to hour
		 */
		this.hours = hours;
	}

	//return hours worked
	public double getHours() {
		return hours;
	}

	//calculate earnings; override abstract method earnings in Programmer

	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) { // no overtime
			return getWage() * getHours();
		}
		else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}

	//return String representation of HourlyProgrammer object
	@Override
	public String toString() {
		return "Hourly Programmer: " + super.toString() + String.format("\nhourly wage: $%.2f; hours worked: %.2f", getWage(), getHours());
	}

	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
	//START
	// INSERT YOUR CODE
	//END


}

