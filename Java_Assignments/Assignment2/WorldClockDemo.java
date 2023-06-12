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
 *  This WorldClock class tests the WorldClock class to see how it's working.
 * @author afnan
 * @version A- 2.1
 * @since Javac 17.0.4.1
 */

public class WorldClockDemo
{

	/**
	 *
	 * @param args creates object for world clock class and test it to show it prints the expected behaviour using time offset.
	 */
	public static void main(String[] args)
	{
		//test WorldClock
		System.out.println("");
		System.out.println("Testing WorldClock class");
		int offset = 3;
		System.out.println("Offset: " + offset);
		WorldClock wclock = new WorldClock(offset);
		System.out.println("Hours: " + wclock.getHours());
		System.out.println("Minutes: " + wclock.getMinutes());
		System.out.println("Time: " + wclock.getTime());


	}
}
