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
 * This class creates an instance of patient class to test the BMI from their height, weight, age and their maximum, minimum, and target heart rate based on
 * the input of a patient.
 * @author afnan 
 * @version A- 1.1
 * @since Javac 17.0.4.1
 * @see Patient
 */

public class MyHealthDataTest {
 /**
  * Tests the patient class to see the methods are working
  * @param args takes input from patient and displays the patient's information
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
		
		Patient myPatient = new Patient(firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight);
		
		myPatient.displayMyHealthData();
		
		scanner.close();

		
	}

}
