package com.example.erick.myapplication.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Erick on 23/09/2017.
 */

public class BD extends SQLiteOpenHelper {
    public BD(Context context) {
        super(context,  "bancoapp", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptDLL.getCreateTableCoordenadas());
        db.execSQL(ScriptDLL.getCreateTablelinhas());
        db.execSQL(ScriptDLL.getCreateTableparadas());
        db.execSQL(ScriptDLL.getCreateTableparadalinha());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
