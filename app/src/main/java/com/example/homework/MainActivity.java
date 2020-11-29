package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText zhanghao = (EditText) findViewById(R.id.zhanghao);
        EditText mima = (EditText) findViewById(R.id.mima);
        Myapplication.zhanghao1 = zhanghao.getText().toString();
        Myapplication.mima1 = mima.getText().toString();
        Button button1 = (Button) findViewById(R.id.zhuce);
        TextView textView1 = (TextView) findViewById(R.id.vx);
        TextView textView2 = (TextView) findViewById(R.id.weibo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, zhuce.class);
                startActivity(intent);
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "微信登录", Toast.LENGTH_SHORT).show();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "微博登录", Toast.LENGTH_SHORT).show();
            }
        });
    }
}