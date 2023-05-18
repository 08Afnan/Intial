package w23assignment2;

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
 *  This ClockDemo class tests the clock class by creating the instance of clock class and prints the working methods for time including hours and minutes.
 * @author afnan
 * @version A- 2.1
 * @since Javac 17.0.4.1
 */



public class ClockDemo

{
	/**
	 *
	 * @param args tests clock class by creating objects for the clock class.
	 */
	public static void main(String[] args)
	{
		//test Clock
		System.out.println("Testing Clock class");
		Clock clock = new Clock();
		System.out.println("Hours: " + clock.getHours());
		System.out.println("Minutes: " + clock.getMinutes());
		System.out.println("Time: " + clock.getTime());
	}
}
