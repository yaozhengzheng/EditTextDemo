package com.example.yaozhengzheng.edittextdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * EditText限制输入演示
 * Created by yaozhengzheng
 * on 2016/12/02.
 */
public class Main2Activity extends AppCompatActivity {

    @InjectView(R.id.edt_m)
    MaterialEditText edtM;
    @InjectView(R.id.btn_true)
    Button btnTrue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.inject(this);

    }

    @OnClick(R.id.btn_true)
    public void onClick() {
        if (edtM.length() > 12) {
            Toast.makeText(this, "超过字数限制，请重新输入！", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "输入成功！", Toast.LENGTH_SHORT).show();
        }
    }
}
