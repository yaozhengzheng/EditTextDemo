package com.example.yaozhengzheng.edittextdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class QqActivity extends AppCompatActivity {

    private ListView listView;
    private DampView damp;
    private ImageView imageview;
    private List<String> listdata;
    private Holder holder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq);
        listdata = new ArrayList<String>();
        listView = (ListView) findViewById(R.id.listview);
        damp = (DampView) findViewById(R.id.dampview);
        imageview = (ImageView) findViewById(R.id.imageview);
        imageview.setImageDrawable(getResources().getDrawable(R.mipmap.damp_bg));
        damp.setImageView(imageview);

        for (int i = 0; i < 20; i++) {
            listdata.add("你好 Man" + i);
        }
        listView.setAdapter(new BaseAdapter() {

            @SuppressWarnings("null")
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                holder = new Holder();
                holder.textview = new TextView(QqActivity.this);
                holder.textview.setGravity(Gravity.CENTER);
                holder.textview.setText(listdata.get(position));
                return holder.textview;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public int getCount() {
                // TODO Auto-generated method stub
                return listdata.size();
            }
        });
        int counth = 0;
        for (int i = 0; i < listdata.size(); i++) {
            View item = listView.getAdapter().getView(i, null, listView);
            item.measure(0, 0);
            int itemh = item.getMeasuredHeight();
            counth += itemh;
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = counth + (listView.getDividerHeight() * (listView.getCount() - 1));
        listView.setLayoutParams(params);
    }
    class Holder {
        TextView textview;
    }

}
