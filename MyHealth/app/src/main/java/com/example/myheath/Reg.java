package com.example.myheath;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regpage);

        Button backButton = findViewById(R.id.back1);
        backButton.setOnClickListener(v -> {
            finish(); // Go back to login
        });

        Button submitButton = findViewById(R.id.submit1);
        submitButton.setOnClickListener(v -> {
            // Handle registration logic here
            String Name = "example_name";
            String Email = "example_email";
            String username = "example_username";
            String password = "example_password";
            String passwordagain = "example_passwordagain";

        });
    }
}
