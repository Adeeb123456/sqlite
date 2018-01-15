package com.sqlitedatabase.sqlite;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sqlitedatabase.sqlite.model.AboutUs;

import static com.sqlitedatabase.sqlite.AppBase.getDb;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AboutUs aboutUs=new AboutUs();
        aboutUs.setAboutUsEn("my company name");
        aboutUs.setAddressEn("address sszas");
        aboutUs.setId(1);

getDb().insertAboutUs(aboutUs);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              AboutUs aboutUs1= getDb().getAboutCompany();
                Toast.makeText(getApplicationContext(),aboutUs.getAddressEn(),Toast.LENGTH_LONG).show();
            }
        },100);

    }
}
