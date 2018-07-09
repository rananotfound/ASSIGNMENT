package com.ashutoshrana.registrationform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,mobile,mail,pwd;
Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editText5);
        mobile = findViewById(R.id.editText6);
        mail = findViewById(R.id.editText7);
        pwd = findViewById(R.id.editText8);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getApplicationContext().getSharedPreferences("My_Name",0);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("NAME",name.getText().toString());
                editor.putString("MOBILE",mobile.getText().toString());
                editor.putString("EMAIL",mail.getText().toString());
                editor.putString("PASSWORD",pwd.getText().toString());
                editor.commit();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this,"Submitted",Toast.LENGTH_SHORT).show();

                startActivity(intent);

            }
        });


    }
}
