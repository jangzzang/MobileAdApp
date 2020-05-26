package com.example.mobileadapp.Admission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mobileadapp.R;

public class AdmissionJungSiActivity extends AppCompatActivity {
    private Button btn_knu_jungsi;
    private ImageView iv_jungsi_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_jung_si);

        btn_knu_jungsi = (Button)findViewById(R.id.btn_knu_susi);
        btn_knu_jungsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ipsi1.knu.ac.kr/ipsi1/regular/guidePre.jsp"));
                intent.setPackage("com.android.chrome");
                startActivity(intent);
            }
        });

        iv_jungsi_back = (ImageView)findViewById(R.id.iv_jungsi_back);
        iv_jungsi_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
