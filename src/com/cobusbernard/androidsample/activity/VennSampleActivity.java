package com.cobusbernard.androidsample.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Display;

import com.cobusbernard.androidsample.R;
import com.cobusbernard.androidsample.ui.CircleShape;
import com.cobusbernard.androidsample.ui.Panel;

/**
 * This activity will demonstrate drawing circles for a Venn diagram. Will make use of alpha-channel to 
 * show overlap.
 * 
 * @author Cobus Bernard
 */
public class VennSampleActivity extends Activity {
	
	private int circle1Value = 50;
	private int circle2Value = 100;
	private int circle3Value = 10;
	
	private Panel panel;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venn);
        init();
        drawCircles();
    }
    
    private void init() {
    	this.panel = (Panel) findViewById(R.id.surfaceView);
    }
    
    private void drawCircles() {
    	int sidePad = 10;
    	int smallCircleSpacing = 5;
    	int scrollBarSpace = 60 + 10;
    	
    	Display display = getWindowManager().getDefaultDisplay(); 
    	int width = display.getWidth();  // deprecated
    	int height = display.getHeight();  // deprecated
    	
    	int maxRadius = ((int) Math.min(height, width)/ 2) - sidePad;
    	int maxWidth = (int) Math.min(height, width);

    	int x = width / 2;
    	int y = maxRadius + sidePad;
    	
    	this.panel.getCircles().add(new CircleShape(x, y, maxRadius, Color.RED));
    	
    	//10-O-5-O-5-O-10
    	//Pad(10)-Circle(smallR)-Space(5)-Circle(smallR)-Space(5)-Circle(smallR)-Pad(10)    	
    	int smallR = (maxWidth - (2 * sidePad) - (3 * smallCircleSpacing)) / 8;
    	
    	int x1 = sidePad + smallR;
    	int x2 = x1 + (2 * smallR) + smallCircleSpacing;
    	int x3 = x2 + (2 * smallR) + smallCircleSpacing;
    	int x4 = x3 + (2 * smallR) + smallCircleSpacing;
    	
    	int ySpaceLeft = height - ((2 * maxRadius) + (2 * sidePad) + scrollBarSpace);
    	
    	int y1 = (2 * maxRadius) + (2 * sidePad) + (ySpaceLeft / 2);

    	this.panel.getCircles().add(new CircleShape(x1, y1, smallR, Color.BLUE));
    	this.panel.getCircles().add(new CircleShape(x2, y1, smallR, Color.GREEN));
    	this.panel.getCircles().add(new CircleShape(x3, y1, smallR, Color.YELLOW));
    	this.panel.getCircles().add(new CircleShape(x4, y1, smallR, Color.GRAY));
    	
    }    
    
    private void drawCircles2() {
    	Display display = getWindowManager().getDefaultDisplay(); 
    	int width = display.getWidth();  // deprecated
    	int height = display.getHeight();  // deprecated
    	
    	int maxRadius = (int) Math.min(height, width) / 2;
    	int maxCircleSize = (int) Math.max(this.circle1Value, this.circle2Value);
    	
    	int circ1Radius = (int) (1.0 * maxRadius / maxCircleSize) * this.circle1Value;  
    	int circ2Radius = (int) (1.0 * maxRadius / maxCircleSize) * this.circle2Value;  
    	
    	int x = width / 2;
    	int y1 = circ1Radius;
    	int y2 = 2 * y1 + circ2Radius;
    	
    	this.panel.getCircles().add(new CircleShape(x, y1, circ1Radius, Color.RED));
    	this.panel.getCircles().add(new CircleShape(x, y2, circ2Radius, Color.BLUE));
    }    
    
}