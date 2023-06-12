package w23assignment2;

import java.util.ArrayList;
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
 *  This class shows how the other clocks in this package is working by calling the objects of each class and shows their time.
 * @author afnan
 * @version A- 2.1
 * @since Javac 17.0.4.1
 */
public class ClocksDemo
{

	/**
	 *
	 * @param args test the CLock,Worldclock, and AlarmClcok class by showing their time and printing their class name beside it.
	 */
	public static void main(String[] args)
	{

		Clock clock = new Clock();
		WorldClock wClock = new WorldClock(1);
		AlarmClock aClock = new AlarmClock();
		aClock.setAlarm(23, 30);

		ArrayList<Clock> clockArray = new ArrayList<Clock>();

		clockArray.add(clock);
		clockArray.add(wClock);
		clockArray.add(aClock);

		for (Clock c : clockArray) {
			System.out.println(c.getTime() + " " + c.getClass().getSimpleName());
		}




	}
}
