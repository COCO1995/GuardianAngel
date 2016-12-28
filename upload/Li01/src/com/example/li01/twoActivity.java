package com.example.li01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle; 
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class twoActivity extends Activity{
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
	super.onCreate(savedInstanceState);
	setContentView(R.layout.two);
	
	button = (Button) findViewById(R.id.button1);
    button.setOnClickListener(new OnClickListener() { 
    @Override
    public void onClick(View v) {
    //µã»÷ºóÖ´ÐÐ
    Intent intent = new Intent();
    intent.setClass(twoActivity.this,MainActivity.class);
    startActivity(intent); }
    });

}
}
