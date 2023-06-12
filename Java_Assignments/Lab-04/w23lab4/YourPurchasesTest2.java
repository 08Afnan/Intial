/**
 * File name:YourPurhaseTest2.java 
 * Author: Afnan Islam
 * Course: CST8284
 * Assignment: Lab-04
 * Date: 2023-02-22
 * Professor:HESHAM SAADAWI
 * Purpose: Purpose of this lab is to use Junit for unit test to get accuracy of code also find a potential bug
 * to fix the cause of that problem.
 * @author afnan
 * @version L-4.1
 * @since Javac 17.0.4.1
 * 
 * 
 */

package w23lab4;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * In this class we are trying to find the cause of problem that has been identified which in a method called
 * testRecordPurchase(). so we had to add another two testcases to fix the problem. Also how the fuction of purchase
 * was working in class YourPurchases.java needed to change.
 * @see YourPurchases
 * @author afnan
 *
 */
public class YourPurchasesTest2 {
	
/**
 * scientific notation to compare double value
 */
	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: RUN THIS AND SHOW THE FAILED TEST 
	
//	@Test
//	public void testCalculateChange() {
//		YourPurchases aPurchase = new YourPurchases();
//		aPurchase.recordPurchase(1.5);
//		aPurchase.receivePayment(5, 0, 0, 0, 0);
//		double changeResult = aPurchase.CalculateChange();
//		double expected = 3.50;
//	    Assert.assertEquals(expected, changeResult, EPSILON);
//		
//		
//	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // TODO: IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE TEST CASES (NOT ALREADY STATED IN THIS CODE)
	   // TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	
	/**
	 * a test case to compare the actual and expected output of purchase amount  after a purchase has made .
	 */
	
	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(12.5);
		double result = aPurchase.getPurchase();
		double expected = 12.5;
		Assert.assertEquals(expected, result, EPSILON);
	}
	
	/**
	 * a test case to compare the actual and expected output of payment amount after payment has made.
	 */
	
	@Test
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(5, 4, 3, 2, 1);
		double result = aPurchase.getPayment();
		double expected = 6.41;
		Assert.assertEquals(expected, result, EPSILON);
	}
	
	/**
	 * a test case to compare the actual and expected output of change calculation after a purchase has made and 
	 * payment had done.Calculating changes should not show any error now
	 */
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(5);
		aPurchase.receivePayment(10, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange(); //the issue must be with CalculateChange()
		double expected = 5;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
		
	}


	
	
}
