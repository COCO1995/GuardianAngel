package com.example.li01;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {
    Button bu=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu = (Button) findViewById(R.id.button1);
        bu.setOnClickListener(new OnClickListener() { 
        @Override
        public void onClick(View v) {
        //µã»÷ºóÖ´ÐÐ
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,twoActivity.class);
        startActivity(intent); }
        });
   }
}

   
