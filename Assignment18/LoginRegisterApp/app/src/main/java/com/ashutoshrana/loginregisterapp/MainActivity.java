package com.ashutoshrana.loginregisterapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView LRText;
    EditText username,password;
    Button login,register;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            LRText=findViewById(R.id.lrText);
            username=findViewById(R.id.username);
            password=findViewById(R.id.password);
            login=findViewById(R.id.logBtn);
            register=findViewById(R.id.regBtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                loginMethod(user,pass);

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                registerMethod(user,pass);


            }
        });
    }





    void loginMethod(String user,String pass){

        try {
            SQLiteDatabase sqLiteDatabase= this.openOrCreateDatabase("userDB",MODE_PRIVATE,null);
            Cursor c= sqLiteDatabase.rawQuery("select * from users where uname='"+user+"'",null);
            int userIndex= c.getColumnIndex("uname");
            int passIndex= c.getColumnIndex("pass");

            c.moveToFirst();

            String realuser=c.getString(userIndex);
            String realPass= c.getString(passIndex);
            if(realPass.equals(pass)&&realuser.equals(user)){
                Log.i("LOGIN","Successful");

                Toast.makeText(getApplicationContext(),"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getApplicationContext(),DisplayActivity.class);
                intent.putExtra("user",user);
                intent.putExtra("pass",pass);
                startActivity(intent);


            }else{
                Log.i("LOGIN","NOT SUCCESSFUL");
                Toast.makeText(MainActivity.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void  registerMethod(String user,String pass){

        SQLiteDatabase sqLiteDatabase=this.openOrCreateDatabase("userDB",MODE_PRIVATE,null);
        sqLiteDatabase.execSQL("create table if not exists users (uname VARCHAR,pass VARCHAR)");


        sqLiteDatabase.execSQL("insert into users values('" + user + "','" + pass + "')");
        Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();



    }
}
