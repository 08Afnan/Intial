package assignment3;
/**
 * File name: Username.java
 *  Author: Afnan Islam
 *  Course: CST8284
 *  Assignment: assignment3
 *  Date:2023-04-09
 *  Professor:HESHAM SAADAWI
 *  Purpose: We are going to see the concept of exception and inner class, how we can re-throw an exception also the concept of checked and
 *  unchecked exception.
 *
 *  In this class we will be working on the concept of rethrowing an exception of an inner class  by another inner class.
 * @author afnan
 * @version 3.1
 * @since Javac 17.0.4.1
 */
public class FishHandler {

	/**
	 *
	 * @throws Exception this static method throws an exception
	 */

	public static void easterEnding() throws Exception  {
		throw new Exception("Easter Ended!");
	}


	/**
	 *
	 * @throws Exception this method rethrows and exception of EasterEnding
	 */
	public static void easterStarting() throws Exception {
		try {
			easterEnding();
		} catch (Exception e) {
			System.err.println("Caught an exception in easterStarting: " + e.getMessage());
			throw e;
		}
	}
	/**
	 * This is the method main which will show how the we catch the exception that has been rethrown
	 * @param args takes a string to show the excution of program.
	 */
	public static void main(String[] args) {
		try {
			easterStarting();
		} catch (Exception e) {
			System.err.println("Caught a rethrown exception in main: " + e.getMessage());
			e.printStackTrace();
		}
	}
}



