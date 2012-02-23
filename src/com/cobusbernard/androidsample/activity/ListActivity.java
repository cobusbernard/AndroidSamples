package com.cobusbernard.androidsample.activity;

import android.app.Activity;
import android.os.Bundle;

import com.cobusbernard.androidsample.R;

/**
 * This activity will demonstrate a List using an adapter.
 * 
 * @author Cobus Bernard
 */
public class ListActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
    }
}