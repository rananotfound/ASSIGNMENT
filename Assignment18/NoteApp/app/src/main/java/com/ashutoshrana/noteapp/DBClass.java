package com.ashutoshrana.noteapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBClass extends SQLiteOpenHelper {
    public DBClass(Context context) {
        super(context,"NOTES",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE NOTE(Title text,Description text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS NOTE");
        onCreate(db);

    }
    public void add(String title, String desc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("Title",title);
        contentValues.put("Description",desc);
        SQLiteDatabase db = getWritableDatabase();
        db.insert("NOTE",null,contentValues);

    }
    public Cursor viewData()
    {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor= db.query("NOTE",null,null,null,null,null,null);
        return cursor;
    }
}
