/**
 * 
 */
package com.cobusbernard.androidsample.ui;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Surface panel to render 2D graphics outside the main thread.
 * 
 * @author Cobus Bernard
 */
public class Panel extends SurfaceView implements SurfaceHolder.Callback{
	
	private ArrayList<CircleShape> circles;
	
	private CanvasThread canvasthread;
	
    public Panel(Context context, AttributeSet attrs) {
		super(context, attrs); 
		// TODO Auto-generated constructor stub
	    getHolder().addCallback(this);
	    this.canvasthread = new CanvasThread(getHolder(), this);
	    setFocusable(true);
	    this.circles = new ArrayList<CircleShape>();
	}

	 public Panel(Context context) {
	    super(context);
	    getHolder().addCallback(this);
	    this.canvasthread = new CanvasThread(getHolder(), this);
	    setFocusable(true);
	    this.circles = new ArrayList<CircleShape>();
	 }

	@Override
	public void onDraw(Canvas canvas) {
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		
		for (CircleShape circle : this.circles) {
			paint.setColor(circle.getColour());
			canvas.drawCircle(circle.getX(), circle.getY(), circle.getR(), paint);
		}
	}
	 
	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// TODO Auto-generated method stub
	    canvasthread.setRunning(true);
	    canvasthread.start();
	}
	
	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		// TODO Auto-generated method stub
		boolean retry = true;
		canvasthread.setRunning(false);
		while (retry) {
			try {
				canvasthread.join();
				retry = false;
			} catch (InterruptedException e) {
				// we will try it again and again...
			}
		}
	}

	/**
	 * @return the circles
	 */
	public ArrayList<CircleShape> getCircles() {
		return circles;
	}

	/**
	 * @param circles the circles to set
	 */
	public void setCircles(ArrayList<CircleShape> circles) {
		this.circles = circles;
	}
}   