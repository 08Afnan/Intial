package Lab6;
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
 *This is the main class where we test our payme interface only using the abstract method getPaymentAmount()
 * @author afnan
 * @version 6.1
 * @since Javac 17.0.4.1
 */

public class PaymeInterfaceTest  {
	/**
	 * This is the main method to run the classes we made the instances of.
	 * @param args creates objects to test the subclasses.
	 */
	public static void main(String[] args) {

		//TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
		// CREATE SIX-ELEMENTS Payme array HERE

		//START CODE
		Payme[] paymeObjects = new Payme[6];

		//END CODE


		// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
		//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
		// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.


		// START CODE

		//invoice 1
		Invoice invoice1 = new Invoice("22776", "brakes", 3, 300);


		//invoice 2
		Invoice invoice2 = new Invoice("33442", "gear", 5, 90.99);

		//salaried programmer
		SalariedProgrammer sp = new SalariedProgrammer("Chioma", "Islam","345-67-0001", 0, 0,320 );

		//hourly programmer
		HourlyProgrammer hp = new HourlyProgrammer("Amara", "Islam", "234-56-7770", 0, 0, 18.95, 40.00);

		//comission programmer
		CommissionProgrammer cp = new CommissionProgrammer("Peter", "Islam", "123-45-6999", 0, 0, 16500.00, 0.44);

		//base-plus commission programmer
		BasePlusCommissionProgrammer bp = new BasePlusCommissionProgrammer("Esther", "Islam", "102-34-5888", 0, 0, 1200.00, 0.04, 720.00);

		paymeObjects[0] = invoice1;
		paymeObjects[1] = invoice2;
		paymeObjects[2] = sp;
		paymeObjects[3] = hp;
		paymeObjects[4] = cp;
		paymeObjects[5] = bp;

		// END CODE


		System.out.println(
				"Payment for Invoices and Programmers are processed polymorphically:\n");

		// generically process each element in array paymeObjects

		for (Payme currentPayme : paymeObjects) {
			// output currentPayme and its appropriate payment amount
			//			System.out.printf("%s \n", currentPayme.toString());

			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				// downcast Payme reference to
				// BasePlusCommissioProgrammer reference, and know why we're doing thisS
				BasePlusCommissionProgrammer programmer =
						(BasePlusCommissionProgrammer) currentPayme;
				System.out.println(programmer.toString());
				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						programmer.getBaseSalary());
				System.out.printf("payment due: $%.2f\n\n", programmer.getPaymentAmount());

			} else if (currentPayme instanceof Invoice){
				Invoice inv = (Invoice) currentPayme;
				System.out.println(inv.toString());
				System.out.printf("payment due: $%.2f\n\n", currentPayme.getPaymentAmount());


			} else if (currentPayme instanceof SalariedProgrammer){
				SalariedProgrammer spr = (SalariedProgrammer) currentPayme;
				System.out.println(spr.toString());
				System.out.printf("payment due: $%.2f\n\n", currentPayme.getPaymentAmount());


				HourlyProgrammer hpr = (HourlyProgrammer) currentPayme;
				System.out.println(hpr.toString());
				System.out.printf("payment due: $%.2f\n\n", currentPayme.getPaymentAmount());

			} else if (currentPayme instanceof CommissionProgrammer){
				CommissionProgrammer cpr = (CommissionProgrammer) currentPayme;
				System.out.println(cpr.toString());
				System.out.printf("payment due: $%.2f\n\n", currentPayme.getPaymentAmount());
			}

			// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR
			// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED

			// START CODE

			// END CODE

		}
	}
}


