package com.sqlitedatabase.sqlite;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;


import com.sqlitedatabase.sqlite.db.DbHelper;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;



public class AppBase extends Application {

    Context context;
    public static HashMap<String, Typeface> fontCache = new HashMap<>();

    public static DbHelper db;
    public static File cacheDir;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this;
        db = new DbHelper(getBaseContext());


        try {

            if (android.os.Environment.getExternalStorageState().equals(
                    android.os.Environment.MEDIA_MOUNTED)) {
                cacheDir = new File(android.os.Environment
                        .getExternalStorageDirectory().toString()
                        + "/Android/data/ae.lateston.uaecompanies/", "Temp");
            } else {
                cacheDir = getCacheDir();
            }
            if (!cacheDir.exists()) {
                //noinspection ResultOfMethodCallIgnored
                cacheDir.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void addFont(String alias, String fontName) {
        if (!fontCache.containsKey(alias)) {
            try {
                Typeface typeface = Typeface.createFromAsset(this.getAssets(), "fonts/" + fontName);
                fontCache.put(alias, typeface);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static DbHelper getDb() {
        return db;
    }



}
