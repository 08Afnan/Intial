package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editTextText);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(clk ->{
            String password = et.getText().toString();


            checkPasswordComplexity(password);

        });
    }

    /**
     *
     * @param password The String object that we are checking
     */
    boolean checkPasswordComplexity(String password) {
         boolean foundUpperCase, foundLowerCase, foundNumber, foundSpecial;

         foundUpperCase = foundLowerCase = foundNumber = foundSpecial = false;

        if(!foundUpperCase)
        {

            Toast.makeText();
            // Say that they are missing an upper case letter;

            return false;

        }

        else if( ! foundLowerCase)
        {
            Toast.makeText( ... ); // Say that they are missing a lower case letter;

            return false;

        }

        else if( ! foundNumber) { ....}

        else if(! foundSpecial) { ... }

        else

            return true; //only get here if they're all true






    }


}

