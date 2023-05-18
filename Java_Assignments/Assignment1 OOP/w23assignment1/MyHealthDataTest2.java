package w23assignment1;

import java.util.Scanner;
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
 * This class creates an instance of patient class to test the get BMI method if it is showing the expected output or not
 * @author afnan 
 * @version A- 1.1
 * @since Javac 17.0.4.1
 * @see Patient
 */

class MyHealthDataTest2 {
	
	/**
	  * Tests the getBMI() method to see if it shows the expected body measure index out of a patient or fails the execution.
	  * @param args takes input from patient and test if test executes successfully or not.
	  */
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int birthMonth;
		int birthDay;
		double height;
		double weight;
		
		System.out.println("Enter first name:");
		firstName = scanner.nextLine();
		
		System.out.println("Enter last name:");
		lastName = scanner.nextLine();

		System.out.println("Enter gender:");
		gender = scanner.nextLine();

		System.out.println("Enter year:");
		birthYear = scanner.nextInt();
		
		System.out.println("Enter month:");
		birthMonth = scanner.nextInt();
		
		System.out.println("Enter day:");
		birthDay = scanner.nextInt();
		
		System.out.println("Enter height in inches:");
		height = scanner.nextDouble();
		
		System.out.println("Enter weight in pounds:");
		weight = scanner.nextDouble();
		
	 	Patient myPatient = new Patient(firstName, lastName, gender, birthYear, birthMonth, birthDay, 69, 170);
	 
		
		 /**
		  *  As the lowest possible BMI is 12. under 12 a person would die. And over 50 it will be detrimental to health.
		  *  source: https://www.ennonline.net/fex/15/limits#:~:text=Based%20on%20these%20figures%20a,James%20et%20al%20(1988).
		  */
		 if (myPatient.getBMI() ==25.101869355177485 ) {
			 System.out.println("TEST CASE 1 SUCCESSFUL");
		 } else {
			 System.out.println("TEST CASE 1 FAILED");

		 }
		 
		 if (myPatient.getBMIErrorVersion() ==25.101869355177485) {
			 System.out.println("TEST CASE 2 SUCCESSFUL");
		 } else {
			 System.out.println("TEST CASE 2 FAILED");

		 }

		
		} 
}
