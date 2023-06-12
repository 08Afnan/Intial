/**
 * File name: EventSchedule2.java 
 * Author: Afnan Islam
 * Course: CST8284
 * Assignment: Lab-03
 * Date: 2023-02-10
 * Professor:HESHAM SAADAWI
 * Purpose: In this file there are four different constructors for event scheduling part two. The focus is how to use reduce duplicating code inside the constructors
 * @author afnan
 * @version L-3.1
 * @since Javac 17.0.4.1
 * 
 */
package lab3package;
import java.time.LocalDate;
import java.util.*;   


/**
 * This class is named EventSchedule Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in them,
 *       for demonstration purposes only. DO NOT PUT input / output
 *       into constructors in real production code!!!
 * 
 * @see  TestDemo
 * @author Afnan Islam
 */

public class EventSchedule2 {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;
	
	/**
	 * month component of the date of
	 */
	private int month;
	
	/**
	 * day component of the date of
	 */
	private int day;
	
	/**
	 * calling the localdate constructor  to see the local time
	 */
	 static LocalDate currentDate = LocalDate.now();	
	 
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule2() {
		this(currentDate.getYear());
		System.out.println("EventSchedule() was called");
	}
	
	/**
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 */
	
	public EventSchedule2(int year) {
		this(year, currentDate.getMonthValue());
		System.out.println("EventSchedule(int) was called");
	}
	
	
	
	/** 
	 * This constructor sets the year as passed, month as passed,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */
	public EventSchedule2(int year, int month) {
	
		this(year, month, currentDate.getDayOfMonth());
		System.out.println("EventSchedule(int, int) was called");
	}
	
	

	/**
	 * 
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */
	
	public EventSchedule2(int year, int month, int day) {
		setyear(year);
		setMonth(month);
		setday(day);
		System.out.println("EventSchedule(int, int, int) was called");

	}
	
	
	/**
	 * Returns the year for this EventSchedule.
	 * @return the year for this EventSchedule.
	 */
	public int getyear() {
		return year;
	}
	/**
	 * Sets the year for this EventSchedule.
	 * @param year The year for this EventSchedule.
	 */
	public void setyear(int year) {
		this.year = year;
	}
	/**
	 * Returns month 
	 * @return month 
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * 
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	/**
	 * day of this in EventSchedule.
	 * @return day of this EventSchedule.
	 */
	public double getday() {
		return day;
	}
	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setday(int day) {
		this.day = day;
	}
	
	/**
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
}
