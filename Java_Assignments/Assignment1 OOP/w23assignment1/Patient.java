package w23assignment1;

import java.time.LocalDate;
import java.time.Period;

/**
 * File name: Username.java 
 *  Author: Afnan Islam
 *  Course: CST8284
 *  Assignment: Assignment 1.1
 *  Date: 2023-02-26
 *  Professor:HESHAM SAADAWI
 *  Purpose: This assignment will print the details of a paitent's age, weight, and height along with birth year and month. It will calculate the BMI 
 *  based on the information provided and shows either a patient is overweight, Normal or Obese.
 * 
 * This class creates different methods to get and set patient's first-name, last-name,gender,birth year, month, and day along with their height and weight.
 * It has also a method to generate the BMI (Body Measure Index) of a patient by calculation their height and weight to print if they are under weight or overweight
 * or has a normal weight.
 * @author afnan 
 * @version A- 1.1
 * @since Javac 17.0.4.1
 * 
 */
public class Patient {

    /**
     * this variable has been used  to present the first-name of a patient.
     */
	private String firstName;
	 /**
     * this variable has been used  to present the last-name of a patient.
     */
	private String lastName;
	/**
     * this variable has been used  to present the gender of a patient.
     */
	private String gender;
	/**
     * this variable has been used  to present the birth-year of a patient.
     */
	private int birthYear;
	/**
     * this variable has been used  to present the birth-month of a patient.
     */
	private int birthMonth;
	/**
     * this variable has been used  to present the birth-day of a patient.
     */
	private int birthDay;
	/**
     * this variable has been used  to present the height of a patient.
     */
	private double height;
	/**
     * this variable has been used  to present the weight of a patient.
     */
	private double weight;

	/**
	 * Parameterized constructor intializes the value for first-name,last-name, gender, birth-year, birth-month, birth-day, height, weight for patient
	 * @param firstName : the first name of a patient
	 * @param lastName  : the last name of a patient
	 * @param gender    : the gender of a patient
	 * @param birthYear : the birth year of a patient
	 * @param birthMonth: the birth month of a patient
	 * @param birthDay  : the birth day of a patient
	 * @param height    : the height of a patient
	 * @param weight    : the weight of a patient
	 */
	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,
			double height, double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * @return the birthMonth
	 */
	public int getBirthMonth() {
		return birthMonth;
	}

	/**
	 * @param birthMonth the birthMonth to set
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * @return the birthDay
	 */
	public int getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

/**
 * this method calculates the birth year, month, day of a patient by current year, month, and day
 * @return Age of patient
 */
	
	public int calculateAge() {
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		LocalDate currentDate = LocalDate.now();
		return Period.between(birthDate, currentDate).getYears();
	}
	
 /**
  * calculates a patient maximum heart rate by deducting the current age from 220
  * @return the maximum heart rate based on someone's age
  */
	
	public int maximumHeartRate( ) {
		return 220 - calculateAge();
	}
	
	
 /**
  * calculates a range of target heart rate which ranges from maximum to minimum  rate 
  * @return the target heart rate
  */
	
	
	public String targetHeartRate( ) {
		double minimumTargetHeartRate = maximumHeartRate( )*0.5;
		double maximumTargetHeartRate = maximumHeartRate( )*0.85;
		return minimumTargetHeartRate + " to " + maximumTargetHeartRate;
	}

/**
 * shows the body measure index of a patient by calculating the height and weight
 * @return BMI of a particular patient
 */

   public  double getBMI() {
      return (getWeight() * 703) / (getHeight() * getHeight());
   }  
   
   /**
    * To test the getBMI method, either the change of code shows error or not
    * @return BMI of a particular patient
    */
   public  double getBMIErrorVersion() {
	   return (getWeight() * 700003) / (getHeight() * getHeight());
	   }  


/**
 * displays the record for a patient by showing their first and last name, gender, date of birth, month, year, their height, weight, age, Body mass Index, 
 * Maximum and minimum heart rate along with their target heart rate
 */

  public void displayMyHealthData() 
  
  { 
	
	System.out.printf("PATIENT DATA:%n"
			+ "First name: %s %n"
			+ "Last name: %s %n"
			+ "Gender: %s %n"
			+ "Date of Birth: %d,%d,%d %n"
			+ "Height: %.1f inches %n"
			+ "Weight: %.1f pounds %n"
			+ "Age: %d %n"
			+ "BMI: %.1f %n"
			+ "Maximum heart rate: %d %n"
			+ "Target heart rate range(min-max): %s %n%n", 
			firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight, 
			calculateAge(), getBMI(), maximumHeartRate( ), targetHeartRate( ) );



   System.out.println("BMI VALUES");
   System.out.println("Underweight: less than 18.5");
   System.out.println("Normal:      between 18.5 and 24.9");
   System.out.println("Overweight:  between 25 and 29.9");
   System.out.println("Obese:       30 or greater");   
} 

} 



