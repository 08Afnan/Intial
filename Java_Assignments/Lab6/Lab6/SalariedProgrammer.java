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
 *  This is the sub class of programmer where we calculate the salary of a programmer also we create a new implementation for our payment
 *   due for a programmer to get the weekly salary.
 * @author afnan
 * @version 6.1
 * @since Javac 17.0.4.1
 */
//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.

public class SalariedProgrammer extends Programmer  {
	/**
	 * an attribute for weekly salary
	 */
	private double weeklySalary;

	/**
	 *
	 * @param firstName sets the first name for a programmer
	 * @param lastName  sets the last name for a programmer
	 * @param socialSecurityNumber  sets the social Security Number for a programmer
	 * @param month sets the month to calculate the wage
	 * @param year  sets the month to calculate the wage
	 * @param weekly salary sets the weekly salary
	 */
	public SalariedProgrammer(String firstName, String lastName,String socialSecurityNumber, int month, int year,double weeklySalary)
	{
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary=weeklySalary;

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

	/**
	 * set salary
	 * @param weeklySalary set weekly salary
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}
		/**
		 *sets the weekly salary to weekly salary
		 */
		this.weeklySalary = weeklySalary;
	}

	/**
	 * return salary
	 * @return weekly salary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	}

	//calculate earnings; override abstract method earnings in Programmer

	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO


	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}

	//return String representation of SalariedProgrammer object
	@Override
	public String toString() {
		return "Salaried Programmer: " + super.toString() + String.format("\nweekly salary: $%.2f", getWeeklySalary() );
	}


	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
	//START
	// INSERT YOUR CODE
	//END
}

