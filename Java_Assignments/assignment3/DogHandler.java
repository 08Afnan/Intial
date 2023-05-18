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
 *  In this class we can see how the type exception take four different parameters and catch four types of exception.
 * @author afnan
 * @version 3.1
 * @since Javac 17.0.4.1
 */
public class DogHandler {

	/**
	 * There are two inner class exception dog and puppy where dog extends the actual exception superclass and puppy extends the dog
	 * inner class to showcase four different exception later.
	 * @author afnan
	 *
	 */
	class ExceptionDog extends Exception {

	}
	/**
	 * An in class of dog handler class and subclass of exception dog
	 * @author afnan
	 *
	 */
	class ExceptionPuppy extends ExceptionDog {

	}
	/**
	 *This is the method main which will catch  four different types of exception.
	 * @param args takes a string to show the excution of program.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside try block");
			DogHandler c = new DogHandler();
			throw c.new ExceptionPuppy();
		}
		catch(Exception ex) {
			System.err.println(ex.getClass().getSimpleName() + " caught in Catch block");
		}

		try {
			System.out.println("Inside try block");
			DogHandler d = new DogHandler();
			throw d.new ExceptionDog();
		}
		catch(Exception ex) {
			System.err.println(ex.getClass().getSimpleName() + " caught in Catch block");
		}

		try {
			System.out.println("Inside try block");
			throw new NullPointerException();

		}
		catch(Exception ex) {
			System.err.println(ex.getClass().getSimpleName() + " caught in Catch block");
		}



		try {
			System.out.println("Inside try block");
			throw new IOException();

		}
		catch(Exception ex) {
			System.err.println(ex.getClass().getSimpleName() + " caught in Catch block");
		}




	}

}


