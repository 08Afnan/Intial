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
 *  This is the interface which we are going to implement later.
 * @author afnan
 * @version 6.1
 * @since Javac 17.0.4.1
 */
public interface Payme {

	/**
	 * this is a un-implemented method that is implemented in the subclasses and invoice class
	 * @return doesn't return anything
	 */
	double getPaymentAmount();

	/**
	 * A defult method to print out the getpaymentAmount method which will show payment due for each class
	 */
	default void display() {
		System.out.printf("payment due: $%.2f\n\n",getPaymentAmount());
	}

}
