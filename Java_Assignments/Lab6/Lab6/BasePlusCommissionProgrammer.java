package Lab6;

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.
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
 *  This is a class where we calculate the base and comission it also a sub class that inherits from commision programmer
 *  class
 * @author afnan
 * @version 6.1
 * @since Javac 17.0.4.1
 */

public class BasePlusCommissionProgrammer extends CommissionProgrammer {

	private double baseSalary; // base salary per week
	/**
	 *
	 * @param firstName sets the first name for a programmer
	 * @param lastName  sets the last name for a programmer
	 * @param socialSecurityNumber  sets the social Security Number for a programmer
	 * @param month sets the month to calculate the base salary
	 * @param year  sets the month to  calculate the base salary
	 * @param grossSales  sets the gross sales to  calculate the base salary
	 * @param commissionRate  sets the comission rate to  calculate the base salary
	 * @param baseSalary  sets the base salary to  calculate the base salary
	 */
	//constructor
	public BasePlusCommissionProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber,
				month, year, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary

			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	//set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	//return base salary
	public double getBaseSalary() {
		return baseSalary;
	}

	//calculate earnings; override method earnings in CommissionProgrammer

	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.earnings();
	}

	//return String representation of BasePlusCommissionProgrammer object
	@Override
	public String toString() {
		return "Base-plus " + super.toString() + String.format("; base salary: $%.2f", getBaseSalary());
	}

	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
	//START
	// INSERT YOUR CODE
	//END


}



