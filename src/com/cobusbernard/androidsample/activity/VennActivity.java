package com.cobusbernard.androidsample.activity;

import android.app.Activity;
import android.os.Bundle;

import com.cobusbernard.androidsample.R;

/**
 * This activity will demonstrate drawing circles for a Venn diagram. Will make use of alpha-channel to 
 * show overlap.
 * 
 * @author Cobus Bernard
 */
public class VennActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venn_activity);
    }
}