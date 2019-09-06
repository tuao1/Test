package com.example.tuao.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // View view=View.inflate(this,R.layout.activity_main,null);
        setContentView(R.layout.activity_main);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.rotate);
        ImageView imageView=findViewById(R.id.image1);
        imageView.startAnimation(animation);
        //view.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Toast.makeText(MainActivity.this,"结束",Toast.LENGTH_SHORT).show();
            }
        });


    }


    @Override
    public void onClick(View v) {

    }
}
