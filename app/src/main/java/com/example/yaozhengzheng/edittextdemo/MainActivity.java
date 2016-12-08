package com.example.yaozhengzheng.edittextdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wayww.edittextfirework.FireworkView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
/**
 * EditText显示彩花效果
 * Created by yaozhengzheng
 * on 2016/12/02.
 */
public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.edit_text)
    EditText editText;
    @InjectView(R.id.day)
    TextView day;
    @InjectView(R.id.night)
    TextView night;
    @InjectView(R.id.activity_main)
    RelativeLayout layout;
    @InjectView(R.id.fire_work)
    FireworkView fireWork;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        fireWork.bindEditText(editText);
    }

    @OnClick({R.id.day, R.id.night})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.day:
                layout.setBackgroundColor(0xFFFFFFFF);
                break;
            case R.id.night:
                layout.setBackgroundColor(0xFF000000);
                break;
        }
    }
}
