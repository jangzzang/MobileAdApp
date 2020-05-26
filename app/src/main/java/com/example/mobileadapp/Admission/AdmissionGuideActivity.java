package com.example.mobileadapp.Admission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mobileadapp.R;

public class AdmissionGuideActivity extends AppCompatActivity {
    private Button btn_admission_top;
    private Button btn_admission_bottom;
    private ImageView iv_admission_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_guide);

        btn_admission_bottom = (Button)findViewById(R.id.btn_admission_bottom);
        btn_admission_top= (Button)findViewById(R.id.btn_admission_top);

        iv_admission_back  = (ImageView)findViewById(R.id.iv_admission_back);
        iv_admission_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_admission_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), AdmissionJungSiActivity.class);
                startActivity(intent);
            }
        });

        btn_admission_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), AdmissionSuSiActivity.class);
                startActivity(intent);
            }
        });

    }
}
