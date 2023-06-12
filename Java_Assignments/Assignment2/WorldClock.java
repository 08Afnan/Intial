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
 *  This WorldClock class inherits the general information from Clock class and implement the new information specific to this class. Here the general beheviour
 *  of a clock changed by creating a time offset.
 * @author afnan
 * @version A- 2.1
 * @since Javac 17.0.4.1
 */


public class WorldClock extends Clock
{
	/**
	 * a private attribute of a class thats sets the time offset.
	 */
	private int offset;
	/**
	 * A constructor for this class that inherits the genaral behaviour of it's parent Clock also adds it's own attribute
	 * @param offset sets the time offset.
	 */
	WorldClock(int offset) {
		super();
		this.offset = offset;
	}
	/**
	 * getHours method inherits the common behaviour of it's parent and implement the hour by using time offset
	 */
	@Override
	public String getHours() {
		int hour = Integer.parseInt(super.getHours()) - 4 + offset;
		return Integer.toString(hour);
	}
	/**
	 * getMinutess method inherits the common behaviour of it's parent and implement the minutes by using time offset
	 */
	@Override
	public String getMinutes() {
		return super.getMinutes();
	}
	/**
	 * getTime method inherits the common behaviour of it's parent and implement the time by using specific hours and minutes implemented in this specific class
	 */
	@Override
	public String getTime() {
		return  getHours() + ":" + getMinutes();
	}


}
