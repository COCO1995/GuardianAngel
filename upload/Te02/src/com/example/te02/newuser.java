package com.example.te02;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class newuser extends Activity {
    private Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newuser);
        butt = (Button) findViewById(R.id.bu);
        butt.setOnClickListener(new OnClickListener() { 
        @Override
        public void onClick(View v) {
        //�����ִ��
        	EditText one = (EditText)findViewById(R.id.zh);
        	EditText one2 = (EditText)findViewById(R.id.ma);
        	EditText one3 = (EditText)findViewById(R.id.ma2);
        	if(one.length() == 0)
        	{
        		Toast.makeText(newuser.this, "�ֻ��Ų���Ϊ��", 0).show();
        	}
        	if(one2.length() == 0)
        	{
        		Toast.makeText(newuser.this, "���벻��Ϊ��", 0).show();
        	}
        	if(one3.length() == 0)
        	{
        		Toast.makeText(newuser.this, "ȷ�����벻��Ϊ��", 0).show();
        	}
        	String str1 = one2.getText().toString().trim();
        	String str2 = one3.getText().toString().trim();
        	boolean isEqual = str1.equals(str2);
        	if(isEqual==false)
        	{
        		Toast.makeText(newuser.this, "ȷ����������", 0).show();        	     
        	}
        	if((one.length()!=0)&&(one2.length()!=0)&&(one3.length()!=0)&&(isEqual==true))
        	{
        		Toast.makeText(newuser.this, "�����ύ�ɹ�", 0).show();        		
        	}
        	//Toast.makeText(newuser.this, "�����ύ�ɹ�", 0).show();
        }
        });
    }
}
