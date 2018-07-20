package com.ashutoshrana.noteapp;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class View extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        listView=findViewById(R.id.list);

        arrayList = new ArrayList<>();


        final DBClass dbClass=new DBClass(View.this);
        final Cursor cursor=dbClass.viewData();

        if(cursor.moveToFirst())

        {
            do
            {
                String title=cursor.getString(cursor.getColumnIndex("Title"));
                String desc=cursor.getString(cursor.getColumnIndex("Description"));


                arrayList.add(title+" "+desc);
            }
            while (cursor.moveToNext());
        }
        arrayAdapter = new ArrayAdapter<>(View.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
