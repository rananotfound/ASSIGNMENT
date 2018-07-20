package com.ashutoshrana.loginregisterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView dpTV,passText;

            dpTV=findViewById(R.id.displayText);
            passText=findViewById(R.id.passText);

            Intent i=getIntent();
            String username=i.getStringExtra("user");
            String password=i.getStringExtra("pass");

            dpTV.setText(dpTV.getText() + username);
            passText.setText(passText.getText() + password);

        }
}
