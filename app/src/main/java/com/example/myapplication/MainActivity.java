package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;
//jjjd
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * In this lab we are going to validate if the password has at least one digit, one uppercase,
 *  one lowercase, and one special character
 * @author Afnan Islam
 * @version 1.0*/public class MainActivity extends AppCompatActivity {
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
        /**
         *  set the text view
         */
        TextView tv = findViewById(R.id.textView);
        /**
         *  set the edit text
         */
        EditText et = findViewById(R.id.editTextText);
        /**
         * set the button
         */
        Button btn = findViewById(R.id.button);

/**
 * setting an on click listner for the the password input
 */
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
         *  variable to check upper case character
         */
        boolean foundUpperCase = false;
        /**
         * variable to check lower case character
         */
        boolean foundLowerCase = false;
        /**
         * variable to check digit
         */
        boolean foundNumber = false;
        /**
         * variable to check special character
         */
        boolean foundSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                foundUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                foundLowerCase = true;
            } else if (Character.isDigit(c)) {
                foundNumber = true;
            } else {
                // Assume any character that is not a letter or digit is a special character
                foundSpecial = true;
            }
        }

        if (!foundUpperCase) {
            Toast.makeText(getApplicationContext(), "Missing an uppercase letter", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!foundLowerCase) {
            Toast.makeText(getApplicationContext(), "Missing a lowercase letter", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!foundNumber) {
            Toast.makeText(getApplicationContext(), "Missing a number", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!foundSpecial) {
            Toast.makeText(getApplicationContext(), "Missing a special character", Toast.LENGTH_SHORT).show();
            return false;
        }
        Toast.makeText(getApplicationContext(), "Password meets complexity requirements", Toast.LENGTH_SHORT).show();
        // Password meets complexity requirements
        return true;
    }
}
