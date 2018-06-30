package com.ashutoshrana.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText5);
        editText = findViewById(R.id.editText6);
        editText = findViewById(R.id.editText7);
        editText = findViewById(R.id.editText8);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this,"Submitted",Toast.LENGTH_SHORT).show();

                startActivity(intent);

            }
        });


    }
}
