package com.cobusbernard.androidsample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.cobusbernard.androidsample.R;

/**
 * This is the starting point for the app. Will have buttons that start different activity samples.
 * 
 * @author Cobus Bernard
 */
public class StartingActivity extends Activity {
	
	private OnClickListener onClickListener;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        init();
        addListeners();
    }
    
    /**
     * Instantiates any required classes for the activity.
     */
    private void init() {
    	this.onClickListener = new OnClickListener() {
			@Override
			public void onClick(View v) {
				launchActivity(v);
			}
    	};
    }
    
    /**
     * Adds the listener method to all buttons.
     */
    private void addListeners() {
    	((Button) findViewById(R.id.listButton)).setOnClickListener(this.onClickListener);
    	((Button) findViewById(R.id.tabButton)).setOnClickListener(this.onClickListener);
    	((Button) findViewById(R.id.vennButton)).setOnClickListener(this.onClickListener);
    }
    
    /**
     * Launches the activity based on the button that was pressed.
     * 
     * @param v	the source of the button press.
     */
    private void launchActivity(View v) {
    	
    	Class classToLaunch = null;
    	
    	switch(v.getId()) {
	    	case R.id.listButton : classToLaunch = ListSampleActivity.class; break;
	    	case R.id.tabButton : classToLaunch = TabSampleActivity.class; break;
	    	case R.id.vennButton : classToLaunch = VennSampleActivity.class; break;
    	}
    	
    	StartingActivity.this.startActivity(new Intent(StartingActivity.this, classToLaunch));
    }
}
