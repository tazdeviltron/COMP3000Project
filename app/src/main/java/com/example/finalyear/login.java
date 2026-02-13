package com.example.finalyear;
import android.annotation.SuppressLint;
import android.os.Bundle;
//import android.database.Cursor;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.RequestQueue;

public class login extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText;
    private RequestQueue requestQueue;
    private Database dbHelper;

    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.loginpage);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        usernameEditText = findViewById(R.id.editTextText);
        passwordEditText = findViewById(R.id.editTextPassword);
        Button loginButton = findViewById(R.id.submit);
        Button RegButton = findViewById(R.id.newuser);
        loginButton.setOnClickListener(view -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
        });
        RegButton.setOnClickListener(view ->{
            setContentView(R.layout.regpage);
        });
    }
}