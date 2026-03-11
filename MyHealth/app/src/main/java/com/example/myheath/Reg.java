package com.example.myheath;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Reg extends AppCompatActivity {

    private EditText editTextName , editTextEmail, editTextUsername, editTextPassword, editTextPasswordAgain;
    private com.example.myheath.Database dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regpage);

        Button backButton = findViewById(R.id.back1);
        backButton.setOnClickListener(v -> {
            finish(); // Go back to login
        });

        Button submitButton = findViewById(R.id.submit1);
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.Email);
        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.Password);
        editTextPasswordAgain = findViewById(R.id.ReEnterPass);

        submitButton.setOnClickListener(v -> {
            // Handle registration logic here
            String Name = editTextName.getText().toString();
            String Email = editTextEmail.getText().toString();
            String Username = editTextUsername.getText().toString();
            String Password = editTextPassword.getText().toString();
            String PasswordAgain = editTextPasswordAgain.getText().toString();
            // add if
            if (Name.isEmpty() || Email.isEmpty() || Username.isEmpty() || Password.isEmpty() || PasswordAgain.isEmpty()) {
                editTextName.setError("Please fill in all fields");
                if (Password.length() < 8) {
                    editTextPassword.setError("Password must be at least 8 characters long");
                }
                if (dbHelper.checkUser(Username, Password)) {
                    editTextUsername.setError("Username already exists");
                } else {
                    if (Password.equals(PasswordAgain)) {
                        // Register the user
                        dbHelper.addUser(Name, Email, Username, Password);

                    } else {
                        editTextPasswordAgain.setError("Passwords do not match");
                    }
                }
            }
        });
        }
}
