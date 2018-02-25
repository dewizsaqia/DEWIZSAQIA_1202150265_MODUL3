package com.example.android.dewizsaqia_1202150265_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ASUS on 2/24/2018.
 */

public class Splash_drink extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_drink);

        final Handler handler= new Handler(); //handler
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }

        }, 3000l);
    }

}
