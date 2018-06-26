package com.example.fancx.day02_animation_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fancx.day02_animation_demo.demo01.FrameActivity01;
import com.example.fancx.day02_animation_demo.demo02.FrameActivity02;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        Intent intent = new Intent();
        switch (view.getId())
        {
            case R.id.but_01:
                intent.setClass(MainActivity.this, FrameActivity01.class);
                break;
            case R.id.but_02:
                intent.setClass(MainActivity.this, FrameActivity02.class);
                break;
        }
        startActivity(intent);
    }
}
