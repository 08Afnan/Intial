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
 *  This AlarmClock class inherits the general information from Clock class and implement an alarm clock to set the alarm to use.
 * @author afnan
 * @version A- 2.1
 * @since Javac 17.0.4.1
 */

public class AlarmClock extends Clock{



	/**
	 * An attribute of a class thats sets the hours for the alarm to 0.
	 */
	int hours = 0;
	/**
	 * An attribute of a class thats sets the minutes for the alarm to 0.
	 */
	int minutes = 0;

	/**
	 * A constructor for this class that inherits the genaral behaviour of it's parent Clock also adds it's own attribute
	 */
	public AlarmClock() {
		super();
	}

	/**
	 * An alarm clock to set the hours and minutes for the alarm
	 * @param hours sets the hours when we need to be alerted
	 * @param minutes sets the minutes when we need to be alerted
	 */
	public void setAlarm(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	/**
	 * Sets the alarm time in the clock by using conditions when it is before the time of the alarm how the clock will bahave, when time of the clock exceeds the
	 * alarm time how it bahaves, and when it is the time for the alarm how the clock will behave.
	 */
	@Override
	public String getTime() {
		int clockHour = Integer.parseInt(super.getHours());
		int clockMinute = Integer.parseInt(super.getMinutes());

		if (hours > clockHour) {
			String toReturn = hours + ":" + minutes;
			hours = 0;
			minutes = 0;
			return toReturn + " Alarm!";
		} else if ( hours == clockHour && clockMinute >= minutes) {
			String toReturn = hours + ":" + minutes;
			hours = 0;
			minutes = 0;
			return toReturn + " Alarm!";
		} else if ( hours == clockHour && minutes > clockMinute) {
			String toReturn = hours + ":" + minutes;
			return toReturn;
		}else if (hours < clockHour) {
			String toReturn = hours + ":" + minutes;
			hours = 0;
			minutes = 0;
			return toReturn + " Alarm!";
		}
		return "";

	}




}
