package com.cobusbernard.androidsample.activity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.cobusbernard.androidsample.R;

/**
 * This activity will demonstrate a Tab using a TabHost.
 * 
 * @author Cobus Bernard
 */
public class TabSampleActivity extends TabActivity {
	
	private TabHost tabHost;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        init();
        setupTabs();
    }
    
    private void init() {
    	this.tabHost = getTabHost();
    }
    
    /**
     * Sets up the tabs in the initial state.
     */
    private void setupTabs() {
        this.tabHost.addTab(this.tabHost.newTabSpec("tab_1")
    		//.setIndicator(buildTabView(this, getString(R.string.tab1_heading)))
    		.setIndicator(getString(R.string.tab1_heading))
			.setContent(R.id.tab1Text));
        
        this.tabHost.addTab(this.tabHost.newTabSpec("tab_2")
    		//.setIndicator(buildTabView(this, getString(R.string.tab2_heading)))
    		.setIndicator(getString(R.string.tab2_heading))
    		.setContent(R.id.tab2Text));
        
        this.tabHost.addTab(this.tabHost.newTabSpec("tab_3")
    		//.setIndicator(buildTabView(this, getString(R.string.tab3_heading)))
    		.setIndicator(getString(R.string.tab3_heading))
    		.setContent(R.id.tab3Text));
        
        this.tabHost.setCurrentTab(0);
    }
}