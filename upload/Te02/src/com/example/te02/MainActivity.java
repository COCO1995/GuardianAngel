package com.example.te02;


import android.net.Uri;
import android.os.Bundle;
import android.app.ActivityGroup;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends ActivityGroup implements View.OnClickListener {
    private final static Class<?>[] sActivityClasses = {
            Activity1.class, Activity2.class, Activity3.class, Activity4.class, Activity5.class
    };

    private final static int[] sResIds = {
           /* R.id.btn1, */
    	R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5
    };

    private final static String[] sActivityIds = {
            "Activity1", "Activity2", "Activity3", "Activity4", "Activity5"
    };

    private RelativeLayout mViewContainer;

    private Button[] mBtns = new Button[sResIds.length];
    
    private int mCurId = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setupViews();
        Button button3 = (Button) findViewById(R.id.btn3);
		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setAction("android.media.action.IMAGE_CAPTURE");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		Button button2 = (Button) findViewById(R.id.btn2);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("http://m.amap.com/");  
				Intent it = new Intent(Intent.ACTION_VIEW, uri);  
				startActivity(it);
			}
		});
		Button button4 = (Button) findViewById(R.id.btn4);
		button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
		        intent.setClass(MainActivity.this,Activity4.class);
		        startActivity(intent); }
		});
		Button button5 = (Button) findViewById(R.id.btn5);
		button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
		        intent.setClass(MainActivity.this,Activity5.class);
		        startActivity(intent); }
		});
    }

    private void setupViews() {
        mViewContainer = (RelativeLayout) findViewById(R.id.container);
        final Button[] btns = mBtns;
        for(int i=0; i< btns.length; i++) {
            btns[i] = (Button) findViewById(sResIds[i]);
            btns[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        if(mCurId == id) {
            return ;
        }
        mCurId = id;
        processViews(id);
    }

    private void processViews(int rid) {
        mViewContainer.removeAllViews();
        final int index = getButtonIndex(rid);
        final View tempView =getLocalActivityManager().startActivity(sActivityIds[index],new Intent(this, sActivityClasses[index]).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)).getDecorView();
        mViewContainer.addView(tempView);
    }

    private int getButtonIndex(int rid) {
        final int length = sResIds.length;
        for (int i = 0; i < length; i++) {
            if (rid == sResIds[i]) {
                return i;
            }
        }
        return 0;
    }
}

