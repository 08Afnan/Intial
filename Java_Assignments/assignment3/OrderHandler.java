package assignment3;

import java.io.IOException;
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
 * In this part we will be showing how the checked exception work and why it shows the compilation error when try to catch the exception of
 * superclass through subclass.
 * @author afnan
 * @version 3.1
 * @since Javac 17.0.4.1
 */
public class OrderHandler {
	/**
	 * This is the method main which catch the superclass exception and in the next block of code why it shows copilation error as it tries to
	 * catch the exception of subclass first rather than super class.
	 * @param args takes a string to show the execution of the program.
	 *
	 */
	public static void main(String[] args) throws IOException {
		try {
			throw new Exception("Superclass Exception");
		} catch (IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}


		/**
		 * Code with Compilation Error
		 */


		//						try {
		//							throw new IOException("Subclass IOException");
		//						} catch (Exception e) {
		//							System.out.println("Caught Exception: " + e.getMessage());
		//						} catch (IOException e) {
		//							System.out.println("Caught IOException: " + e.getMessage());
		//						}


		/**
		 * Code without Compilation Error
		 */
		try {
			throw new IOException("Subclass IOException");

		} catch (IOException e) {
			System.out.println("Caught Exception: " + e.getMessage());

		} catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());

		}
	}

}


