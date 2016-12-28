package com.example.te02;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity5 extends Activity {
    private Button bu;private Button bu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5_layout);
        bu = (Button) findViewById(R.id.button1);
        bu.setOnClickListener(new OnClickListener() { 
        @Override
        public void onClick(View v) {
        //点击后执行
        Intent intent = new Intent();
        intent.setClass(Activity5.this,login.class);
        startActivity(intent); }
        });
        
        bu2 = (Button) findViewById(R.id.button2);
        bu2.setOnClickListener(new OnClickListener() { 
        @Override
        public void onClick(View v) {
        //点击后执行
        Intent intent = new Intent();
        intent.setClass(Activity5.this,newuser.class);
        startActivity(intent); }
        });
    }
}
