/**
 * File name: TestDemo.java 
 * Author: Afnan Islam
 * Course: CST8284
 * Assignment: Lab-03
 * Date: 2023-01-27
 * Professor:HESHAM SAADAWI
 * Purpose: this class is created to test both EventSchedule and EventSchedule2 class. Here, we call two methods 
 * to print out the functions of both classes that are built slightly different way but showing the same output.
 * built
 * @author afnan
 * @version L-3.1
 * @since Javac 17.0.4.1
 * 
 */
package lab3package;



/**
 * This is the TestDemo class for this program. This means that it just runs the application with a method
 * main.
 * @author Afnan Islam
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	

	public static void main(String[] args) {

	/**
	 * YOUR CODE STARTS HERE
	*/
		
		//==============PART A==============================================

	System.out.println("Just creating 4 EventSchedules\n");
	
	System.out.println("EventSchedule1");
	System.out.println(new EventSchedule().createReport());
	
	System.out.println();
	
	System.out.println("EventSchedule2");
	System.out.println(new EventSchedule(2024).createReport());
	
	System.out.println();
	
	System.out.println("EventSchedule3");
	System.out.println(new EventSchedule(2023, 12).createReport());
	
	System.out.println();
	
	System.out.println("EventSchedule4");
	System.out.println(new EventSchedule(2023, 12, 15).createReport());
	
	//==============PART B==============================================
	System.out.println();

	System.out.println("Just creating 4 EventSchedules (PART B)\n");
	
	System.out.println("EventSchedule1");
	System.out.println(new EventSchedule2().createReport());
	
	System.out.println();
	
	System.out.println("EventSchedule2");
	System.out.println(new EventSchedule2(2024).createReport());
	
	System.out.println();
	
	System.out.println("EventSchedule3");
	System.out.println(new EventSchedule2(2023, 12).createReport());
	
	System.out.println();
	
	System.out.println("EventSchedule4");
	System.out.println(new EventSchedule2(2023, 12, 15).createReport());

	
	
	}

}
