package com.ashutoshrana.registrationform;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TextView name,gen,mobile,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        SharedPreferences sp = getApplicationContext().getSharedPreferences("My_Name",0);
        name=findViewById(R.id.textView3);
        mobile=findViewById(R.id.textView4);
        email=findViewById(R.id.textView6);
        gen=findViewById(R.id.textView11);
        String name_f = sp.getString("NAME", "");
//        String pwd_f = sp.getString("PASSWORD","");
        String mail_f = sp.getString("EMAIL", "");
        String mobile_f = sp.getString("MOBILE","");
        name.setText(name_f);
//        pwd.setText(pwd_f);
        mobile.setText(mobile_f);
        email.setText(mail_f);

    }
}
