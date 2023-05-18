import java.util.concurrent.TimeUnit;

/**
 * File name: CovidStatistics.java 
 * Author: Afnan Islam
 * Course: CST8284
 * Assignment: Lab-02
 * Date: 2023-02-03
 * Professor:HESHAM SAADAWI
 * Purpose: In this file there are several loops to printout the covid recovered patients over 8month in 7 different province.
 * It will also show the total number of patients that recovered each month and shows the monthly average of patients recovered
 * out of the total number. 
 * CovidStatics class has been created to test arrays with double for loops to see the covid recovered patients over 8month 
 * in 7 different province.It will also show the total number of patients that recovered each month and shows the monthly average of 
 * patients recovered out of the total number. There will be another loop for monthly average to reduce the timing of the loop execution. 
 * @author afnan
 * @version L-2.1
 * @since Javac 17.0.4.1
 * 
 */

public class CovidStatistics
{
 /**
  * 
  * @param args It is a method main for Covid Statistic class. There are two static variable 
  * and two list of arrays one for patients and one for province.
  */
public static void main(String[] args)
 {
   /**
    * {@value } ROWS will hold the value for each seven  provinces 
    */
   final int ROWS = 7;
   /**
    * {@value } COLUMNS will hold the value for each month's  recovered patients
    */
   final int COLUMNS = 8;
   /**
    * A list of numbers for patients recovered each month in each  province.
    */
   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };
   /**
    * A list of provinces 
    */

   String[] provinces = 
      { 
         "Ontario", 
         "Quebec", 
         "Nova Scotia",
         "New Brunswick", 
         "Manitoba", 
         "British Columbia",
	     "Prince Edward Island"         
      };
   

   System.out.println("             Month      Feb     March   April   May     June    July    Aug     Sept");

   System.out.println();

   /**
    * A nested loop for the number of patients per province
    */
   for (int i = 0; i < ROWS; i++) {
	   /**
		 * %20s  creates space between the province name and patients numbers
		 * printf help us to see the expected pattern in our console output
		 */
    	System.out.printf("%20s", provinces[i]);
    	for (int j = 0; j < COLUMNS; j++) {
    		/**
    		 * %8d creates space between the patients numbers and province name 
    		 */
    		System.out.printf("%8d", patients[i][j]);
    	} 
    	
    	System.out.println();
    }
 
   System.out.println();
   System.out.print("  Recovered Patients");

  
  /**
   * A nested loop to create the total number of patients  each month
   */
   for (int i = 0; i < COLUMNS; i++) {
	   	int sum = 0;

   	for (int j = 0; j < ROWS; j++) {

   		sum = sum + patients[j][i];
   	}
   	/**
   	 * creates a desired space between the text "recovered patient" and total number of patient.
   	 */
   	System.out.printf("%8d", sum);

   }
   
   /**
    * =========================PART 1B===================================
    * A nested for loop to see the monthly average for patients for each province and each months.
    */
   System.out.println();
   System.out.print("     Monthly Average");
   /**
    * Here I have added a loop timer to see how many or how fast the loop is executing. I used a built in java 
    * API method. To know more about the .nanoTime method please see the source link bellow.
    * Source: https://www.javatpoint.com/java-program-to-find-the-sum-of-each-row-and-each-column-of-a-matrix
    */
   long startTime = System.nanoTime();
   for (int i = 0; i < COLUMNS; i++) {
	   	int sum = 0;
  	for (int j = 0; j < ROWS; j++) {
  		sum = sum + patients[j][i];
  	}
  	/**
   	 * creates a desired space between the text "Monthly average and average number of patient.
   	 */
  	System.out.printf("%8d", sum/ROWS);
   }
   
   long endTime   = System.nanoTime();
   long totalTime = endTime - startTime;
   System.out.println("\n");
   System.out.println("Total time in nanoseconds: " + totalTime);
   
   //===============optimize==================================================
 
   System.out.println();
   System.out.print("    Monthly Average 2");
   /**
    * Here I have added another loop timer to see how many or how fast the loop is executing Using same method.
    * Where in the monthly average  the loop ran for the inner loop until reaches the outer loop then summed up the
    * recovered patient(running the execution for console output horizontally).
    * 
    * But to optimize it by reducing time of loop execution in Monthly Average 2, the loop ran for the inner then
    * did the addition of recovered patients each month until it went to outer loop(running the execution for console output vertically).
    *
    */
   int[] sums = new int[COLUMNS];
   long startTime2 = System.nanoTime();
   for (int i = 0; i < COLUMNS; i++) {
	   for (int j = 0; j < ROWS; j++) {
		   sums[i]+= patients[j][i];
	   }
   }
   long endTime2   = System.nanoTime();
   long totalTime2 = endTime2 - startTime2;
   

   for (int i = 0; i < 8; i++) {
	   System.out.printf("%8d", sums[i]/ROWS);
   }

   
   System.out.println("\n");
   System.out.println("Total optimized time in nanoseconds: " + totalTime2);
   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!" );
}
}




   
   
   
   
   





