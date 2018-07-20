package com.ashutoshrana.noteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Add extends AppCompatActivity {
TextView title,desc;
Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title=findViewById(R.id.editText2);
        desc=findViewById(R.id.editText);
        save=findViewById(R.id.button);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    DBClass dbClass = new DBClass(Add.this);
                    dbClass.add(title.getText().toString(), desc.getText().toString());

                    Toast.makeText(Add.this,"File saved",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Add.this, MainActivity.class);
                    startActivity(intent);
                }

        });

    }
}
