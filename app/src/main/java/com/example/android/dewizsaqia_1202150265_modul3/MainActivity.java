package com.example.android.dewizsaqia_1202150265_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText  username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Login(View view) {
        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass);

        if(username.getText().toString().equals("EAD")&& password.getText().toString().equals("mobile")){
            startActivity(new Intent(getApplicationContext(),ListMineral.class));
            Toast.makeText(getApplicationContext(),"login berhasil", Toast.LENGTH_SHORT).show();
        }//kondisi kalau berhasil
        else{
            Toast.makeText(getApplicationContext(), "login gagal", Toast.LENGTH_SHORT).show();

        }
    }
}
