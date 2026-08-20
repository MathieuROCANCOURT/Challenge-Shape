/**
 * 
 */
package graphic;

import java.awt.Point;

/**
 * 
 */
public abstract class Shape {
	private Point center;
	
	public Shape(int x, int y) {
		this.center = new Point(x, y);
	}
	
	public Shape(Point center) {
		int x = center.x;
		int y =center.y;
		this.center = new Point(x, y);
	}
	
	public double area() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Shape [center = " + center + " ]";
	}
}

