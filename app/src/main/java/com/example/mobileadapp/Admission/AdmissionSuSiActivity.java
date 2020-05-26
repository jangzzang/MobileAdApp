package com.example.mobileadapp.Admission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mobileadapp.R;

public class AdmissionSuSiActivity extends AppCompatActivity {
    ImageView btn_susi_back;
    Button btn_knu_susi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_su_si);
        btn_susi_back =(ImageView)findViewById(R.id.iv_susi_back);
        btn_susi_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_knu_susi = (Button)findViewById(R.id.btn_knu_susi);
        btn_knu_susi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ipsi1.knu.ac.kr/ipsi1/rolling/guide.jsp"));
                intent.setPackage("com.android.chrome");
                startActivity(intent);
            }
        });


    }
}
