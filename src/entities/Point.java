/**
 * 
 */
package entities;

import java.awt.Graphics;

/**
 * 
 */
public class Point extends Shape {
	public Point(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(getX(), getY(), 0, 0);
	}
}