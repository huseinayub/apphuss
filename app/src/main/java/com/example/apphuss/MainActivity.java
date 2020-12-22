package com.example.apphuss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TakeMePlug1(View view) throws ClassNotFoundException {
        if(view.getId()==R.id.button1){
            Intent intent = new Intent(MainActivity.this, Class.forName("com.example.geolocate.MainAct"));
            startActivity(intent);
        }
    }

    public void TakeMePlug2(View view) throws ClassNotFoundException {
        if(view.getId()==R.id.button2){
            Intent intent = new Intent(MainActivity.this, Class.forName("com.hbisoft.hbrecorder.MainActivity"));
            startActivity(intent);
        }
    }
    public void TakeMePlug3(View view) throws ClassNotFoundException {
        if(view.getId()==R.id.button3){
            Intent intent = new Intent(MainActivity.this, Class.forName("com.creativityapps.gmailbackgroundlibrary.MainActivity"));
            startActivity(intent);
        }
    }
    public void TakeMePlug4(View view) throws ClassNotFoundException {
        if(view.getId()==R.id.button4){
            Intent intent = new Intent(MainActivity.this, Class.forName("cafe.adriel.androidaudiorecorder.MainActivity"));
            startActivity(intent);
        }
    }
}