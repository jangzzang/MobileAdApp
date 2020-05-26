package com.example.mobileadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CurriculumActivity extends AppCompatActivity {
    private ImageView iv_curri_back;
    private Button btn_first;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum);

        iv_curri_back =(ImageView)findViewById(R.id.iv_curri_back);
        iv_curri_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_first = (Button)findViewById(R.id.btn_first_grade);
        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),FirstGradeActivity.class);
                startActivity(intent);
            }
        });
    }
}
