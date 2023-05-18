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
 *  This is the sub class where we calculate the commission of a programmer also we create a new implementation for our payment due for a programmer
 *  who gets commission.
 * @author afnan
 * @version 6.1
 * @since Javac 17.0.4.1
 */

//CommissionProgrammer.java

//CommissionProgrammer class extends Programmer.

public class CommissionProgrammer extends Programmer {

	/**
	 * attribute for gross weekly sales
	 */
	private double grossSales;
	/**
	 * attribute for commission percentage
	 */
	private double commissionRate;

	//constructor
	/**
	 *
	 * @param firstName sets the first name for a programmer
	 * @param lastName  sets the last name for a programmer
	 * @param socialSecurityNumber  sets the social Security Number for a programmer
	 * @param month sets the month to calculate the wage
	 * @param year  sets the month to calculate the wage
	 * @param grossSales  sets the gross Sales to calculate the gross salary
	 * @param commissionRate sets the commission Rate to calculate the commission rate for wage
	 */
	public CommissionProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	/**
	 * set gross sales amount on the creation of apps
	 * @param grossSales the gross salary of programmer
	 */

	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		/**
		 * sets the gross sales to gross sales
		 */
		this.grossSales = grossSales;
	}

	/**
	 * return gross sales amount
	 * @return gross sales
	 */
	public double getGrossSales() {
		return grossSales;
	}

	/**
	 * set commission rate
	 * @param commissionRate comission rate of a programmer
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

	/**
	 * return commission rate
	 * @return
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	//calculate earnings; override abstract method earnings in Programmer.

	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	@Override
	public double getPaymentAmount() {
		return earnings();
	}

	//return String representation of CommissionProgrammer object

	@Override
	public String toString() {
		return "Commission Programmer: " + super.toString() + String.format("\ngross sales: $%.2f; commission rate: %.2f", getGrossSales(), getCommissionRate());
	}

	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
	//START
	// INSERT YOUR CODE
	//END

}

