/**
 * 
 */
package com.cobusbernard.androidsample.ui;

/**
 * Represents a circle shape.
 * 
 * @author Cobus Bernard
 */
public class CircleShape {

	private int x;
	private int y;
	private int r;
	private int colour;
	
	
	/**
	 * Default constructor.
	 * 
	 * @param x			the x co-ordinate of the circle.
	 * @param y			the y co-ordinate of the circle.
	 * @param r			the radius of the circle.
	 * @param colour	the colour to use.
	 */
	public CircleShape(int x, int y, int r, int colour) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.colour = colour;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the r
	 */
	public int getR() {
		return this.r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		this.r = r;
	}

	/**
	 * @return the colour
	 */
	public int getColour() {
		return this.colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(int colour) {
		this.colour = colour;
	}
	
}
