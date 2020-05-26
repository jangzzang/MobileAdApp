package com.example.mobileadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {
    private Button btn_to_googleMap;
    private TextView btn_call;
    private ImageView iv_contact_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        btn_to_googleMap = (Button)findViewById(R.id.btn_googleMap);
        btn_to_googleMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ContactMapActivity.class);
                startActivity(intent);
            }
        });

        btn_call = (TextView) findViewById(R.id.btn_call);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:053-950-6571"));
                startActivity(intent);
            }
        });

        iv_contact_back = (ImageView)findViewById(R.id.iv_contact_back);
        iv_contact_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
