/**
 * 
 */
package entities;

import java.awt.Graphics;

/**
 * 
 */
public abstract class Shape {
	private int x;
	private int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Shape(Point point) {
		this.x = point.getX();
		this.y = point.getY();
	}

	public double area() {
		return 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract void draw(Graphics g);
}
