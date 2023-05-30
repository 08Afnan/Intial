      ******************************************************************
      * Author: Afnan Islam
      * Date: 2023-05-30
      * Purpose: In this file I have prompt users for their height and
      * weight to calculate their Body Mass Index(BMI)
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. BMI.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
      *Numeric attributes for calculation*
           01 HEIGHT_INCHES PIC 999.
           01 WEIGHT PIC 999.
           01 BMI PIC 999V99.
       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
      *To Promt user to enter their height*
            DISPLAY "Please Enter your Height(In inches): ".
      *Accepting and recording the value given by user*
            ACCEPT HEIGHT_INCHES.
      *To Promt user to enter their Weight*
            DISPLAY "Please Enter Your Weight(In Pounds): ".
      *Accepting and recording the value given by user*
            ACCEPT WEIGHT.
      *Calculation of BMI *
            COMPUTE BMI = WEIGHT * 703 / (HEIGHT_INCHES * HEIGHT_INCHES)
      *Displaying the calculated BMI with a customized display*
            DISPLAY "The BMI is:  ", BMI, "%"
            STOP RUN.
       END PROGRAM BMI.
