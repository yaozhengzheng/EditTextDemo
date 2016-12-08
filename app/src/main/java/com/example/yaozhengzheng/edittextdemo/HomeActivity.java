package com.example.yaozhengzheng.edittextdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @InjectView(R.id.btn_1)
    Button btn1;
    @InjectView(R.id.btn_2)
    Button btn2;
    @InjectView(R.id.btn_3)
    Button btn3;
    @InjectView(R.id.btn_4)
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.inject(this);
        ImageView img = (ImageView) findViewById(R.id.img);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_loading);
        img.setAnimation(animation);
        animation.start();
    }

    @OnClick({R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                break;
            case R.id.btn_2:
                startActivity(new Intent(HomeActivity.this, Main2Activity.class));
                break;
            case R.id.btn_3:
                startActivity(new Intent(HomeActivity.this, QqActivity.class));
                break;
            case R.id.btn_4:
                startActivity(new Intent(HomeActivity.this, PulltoActivity.class));
                break;
        }
    }
}
