package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * In this lab I am validating the password if it includes at least one uppercase character, one lowercase character
 * , and  one special character
 * @author Afnan Islam
 * @version 1.1
 */
public class MainActivity extends AppCompatActivity {


    /**
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editTextText);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(clk -> {
            String password = et.getText().toString();

            boolean isPasswordComplex = checkPasswordComplexity(password);




        });
    }

    /**
     * Check the complexity of the password.
     *
     * @param password The password string to check
     * @return True if the password meets complexity requirements, false otherwise
     */
    boolean checkPasswordComplexity(String password) {
        /**
         * checks for an upper case character
         */
        boolean foundUpperCase = false;
        /**
         * checks for an lower case character
         */
        boolean foundLowerCase = false;
        /**
         * checks for a digit
         */
        boolean foundNumber = false;
        /**
         * checks for a special character
         */
        boolean foundSpecial = false;
        /**
         * attribute to CATCH the text of the state for each character
         */
        StringBuilder toastText = new StringBuilder();

        /**
         * A for loop to iterate through each character
         */

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                foundUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                foundLowerCase = true;
            } else if (Character.isDigit(c)) {
                foundNumber = true;
            } else {
                /**
                 *  Assume any character that is not a letter or digit is a special character
                 */
                foundSpecial = true;
            }
        }

        if (!foundUpperCase) {
            toastText.append("Missing an uppercase letter\n");
        }
        if (!foundLowerCase) {
            toastText.append("Missing a lowercase letter\n");
        }
        if (!foundNumber) {
            toastText.append("Missing a number\n");
        }
        if (!foundSpecial) {
            toastText.append("Missing a special character\n");
        }
        TextView tv = findViewById(R.id.textView);
        if (toastText.length() > 0) {
            tv.setText(toastText.toString());
            return false;
        } else {
            tv.setText("Password meets complexity requirements");
            return true;
        }
    }

}
