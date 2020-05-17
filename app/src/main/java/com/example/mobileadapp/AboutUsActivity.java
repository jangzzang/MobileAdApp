package com.example.mobileadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class AboutUsActivity extends AppCompatActivity {
   public String arrayName[] = {"What is SME","","Graduate"};
   private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        imageView = (ImageView)findViewById(R.id.view_about_us);
        imageView.setImageResource(R.drawable.ic_add_circle_outline_black_24dp);
        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_add_circle_outline_black_24dp,R.drawable.ic_add_circle_outline_black_24dp)
                .addSubMenu(Color.parseColor("#258Cff"),R.drawable.ic_add_circle_outline_black_24dp)
                .addSubMenu(Color.parseColor("#f2f2f2"),R.drawable.ic_add_circle_outline_black_24dp)
                .addSubMenu(Color.parseColor("#f21f2f"),R.drawable.ic_add_circle_outline_black_24dp)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(AboutUsActivity.this, arrayName[index]+"선택", Toast.LENGTH_SHORT).show();
                        switch(index){
                            case 0 : imageView.setImageResource(R.drawable.about_mobile); break;
                            case 1 : imageView.setImageResource(R.drawable.viewpagerfirst);break;
                            case 2: imageView.setImageResource(R.drawable.viewpagersecond);break;
                        }


                    }
                });
    }
}
