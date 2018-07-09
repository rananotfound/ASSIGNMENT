package com.ashutoshrana.registrationform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText mail,pwd;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mail = findViewById(R.id.editText);
        pwd = findViewById(R.id.editText2);
        button = findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getApplicationContext().getSharedPreferences("My_Name",0);
                String mail_f = sp.getString("EMAIL", "");
                String pwd_f = sp.getString("PASSWORD","");
                if(mail.getText().toString().equals(mail_f) && pwd.getText().toString().equals(pwd_f))
                {
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Main2Activity.this,"Wrong Credentials",Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}
