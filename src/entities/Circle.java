/**
 * 
 */
package entities;

import java.awt.Graphics;

/**
 * 
 */
public class Circle extends Shape {
	private double radius;

	public Circle(double radius, int x, int y) {
		super(x, y);
		setRadius(radius);
	}

	public Circle(double radius, Point point) {
		super(point);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0)
			this.radius = 13;
		else
			this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval((int) (super.getX() - this.radius), (int) (super.getY() - this.radius), (int) (2 * radius),
				(int) (2 * radius));
	}
}