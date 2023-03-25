package com.example.homeworkchangeimage;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv1;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.imageView1);
        iv2 = findViewById(R.id.imageView2);

        View button01 = findViewById(R.id.button1);
    }

    public void onButton1(View v){
        showIv1();
    }

    public void onButton2(View v){
        showIv2();
    }

    private void showIv1(){
        iv1.setImageResource(R.drawable.photo1);
        iv2.setImageResource(0);
    }

    private void showIv2(){
        iv2.setImageResource(R.drawable.photo2);
        iv1.setImageResource(0);
    }
}