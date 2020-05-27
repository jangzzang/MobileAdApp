package com.example.mobileadapp.Curriculum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mobileadapp.Curriculum.FirstGradeActivity;
import com.example.mobileadapp.Curriculum.SecondGradeActivity;
import com.example.mobileadapp.R;

public class CurriculumActivity extends AppCompatActivity {
    private ImageView iv_curri_back;
    private Button btn_first;
    private Button btn_second;
    private Button btn_third;
    private Button btn_fourth;
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
                Intent intent = new Intent(getApplication(), FirstGradeActivity.class);
                startActivity(intent);
            }
        });
        btn_second = (Button)findViewById(R.id.btn_second_grade);
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SecondGradeActivity.class);
                startActivity(intent);
            }
        });

        btn_third = (Button)findViewById(R.id.btn_third_grade);
        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),ThirdGradeActivity.class);
                startActivity(intent);
            }
        });

        btn_fourth = (Button)findViewById(R.id.btn_fourth_grade);
        btn_fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),FourthGradeActivity.class);
                startActivity(intent);
            }
        });
    }
}
