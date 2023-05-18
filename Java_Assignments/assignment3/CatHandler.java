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
 *  Here we will see how polymorphically extending the class exception let us catch the exception of two sub and inner classes ExceptionBeta and Gammer.
 * @author afnan
 * @version 3.1
 * @since Javac 17.0.4.1
 */
public class CatHandler {
	/**
	 * In this cat handler class there are two subclasses which is also the inner class, exception beta and exception Gammer.We wiill
	 * catch the exception for these two classes in the catch block of exception alpha.
	 * @author afnan
	 *
	 */
	class ExceptionAlpha extends Exception {
	}

	/**
	 * An inner class of cathandler class and sublass of exception alpha
	 * @author afnan
	 *
	 */
	class ExceptionBeta extends ExceptionAlpha {
	}
	/**
	 * An inner class of cathandler class and sublass of exception beta
	 * @author afnan
	 *
	 */
	class ExceptionGammer extends ExceptionBeta {
	}
	/**
	 * It is the main method of this class which will execute the code block where exception of Beta and Gammer will be caught.
	 * @param args takes a string to show the excution of program.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Inside try block");
			CatHandler c = new CatHandler();
			throw c.new ExceptionGammer();

		}
		catch(ExceptionAlpha ex)
		{
			System.err.println(ex.getClass().getSimpleName() + " caught in Catch block");
		}

		// rest program will be executed




		try
		{
			System.out.println("Inside try block");
			CatHandler D = new CatHandler();
			throw D.new ExceptionBeta();
		}
		catch(ExceptionAlpha ex)
		{
			System.err.println(ex.getClass().getSimpleName() + " caught in Catch block");
		}

		// rest program will be executed
		System.out.println("Outside try-catch clause");

	}

}