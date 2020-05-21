package com.example.mobileadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private double pressedTime= 0;
    private Button button_about_us;
    private Button button_contact;
    private Button button_sme;
    private Button button_cafe;
    private Button button_elect;
    @Override
    public void onBackPressed() {
        if(pressedTime ==0){
            Toast.makeText(this, "한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
            pressedTime = System.currentTimeMillis();
        }else{
            int seconds = (int)(System.currentTimeMillis() - pressedTime);
            if(seconds>2000){
                Toast.makeText(this, "한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
                pressedTime = 0;
            }else{
                moveTaskToBack(true);
                finish();
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_about_us = findViewById(R.id.button_about_us);
        button_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), AboutUsActivity.class);
                startActivity(intent);
            }
        });

        button_contact = findViewById(R.id.button_contact);
        button_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),ContactActivity.class);
                startActivity(intent);
            }
        });

        button_sme = findViewById(R.id.button_sme_homepage);
        button_sme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://smobile.knu.ac.kr/"));
                intent.setPackage("com.android.chrome");
                startActivity(intent);
            }
        });

        button_cafe = findViewById(R.id.button_cafe);
        button_cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.naver.com"));
                intent.setPackage("com.android.chrome");
                startActivity(intent);
            }
        });

        button_elect = findViewById(R.id.button_elec_hompage);

    }
}

