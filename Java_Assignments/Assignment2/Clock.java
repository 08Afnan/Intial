package w23assignment2;

import java.time.LocalTime;
/**
 * File name: Username.java
 *  Author: Afnan Islam
 *  Course: CST8284
 *  Assignment: Assignment 2
 *  Date: 2023-03-19
 *  Professor:HESHAM SAADAWI
 *  Purpose: In this Assignment we will implement a general class clock and two classes extends the clock class to share the common elements of clock class.
 *  We also created a world clock using universal time clock and an alarm clock that shows the time of alarm. In our clocksDemo class we showed which clock is
 *  showing which time using the concept of polymorphisom where we established resue of code and reduced redundency.
 *
 *  This Clock class repersent the general information of a clock that shows time based on location.We will be using the general information in other
 *  classes.
 * @author afnan
 * @version A- 2.1
 * @since Javac 17.0.4.1
 */



public class Clock
{

	/**
	 * an attribute location to see the time of a specific location.
	 */
	private String location;

	/**
	 * getHour() is a method that is implemented to see local time in hours
	 * @return the local time for the location
	 */
	public String getHours() {
		return LocalTime.now().toString().substring(0, 2);

	}

	/**
	 * getMinutes() is a method that is implemented to see local time in Minutes
	 * @return the local time for the location
	 */
	public String getMinutes() {
		return LocalTime.now().toString().substring(3, 5);
	}

	/**
	 * getTime() is a method that is implemented to see local time in Minutes and hours
	 * @return the local Minutes and hours for the location
	 */
	public String getTime() {
		return getHours() + ":" + getMinutes();

	}










}
