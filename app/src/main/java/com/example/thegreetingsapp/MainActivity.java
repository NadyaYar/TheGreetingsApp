package com.example.thegreetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.EditText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.title);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = editText.getText().toString();

                if (inputName.isEmpty()
                        || !inputName.matches(".*[a-zA-Z].*")
                        || inputName.matches(".*[^a-zA-Z].*")) {
                    Toast.makeText(MainActivity.this,
                            "Please write your name", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Welcome " + inputName + " to our App", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}