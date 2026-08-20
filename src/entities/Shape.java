/**
 * 
 */
package entities;

/**
 * 
 */
public abstract class Shape {
	private Point center;

	public Shape(int x, int y) {
		this.center = new Point(x, y);
	}

	public Shape(Point center) {
		int x = center.getX();
		int y = center.getY();
		this.center = new Point(x, y);
	}

	public double area() {
		return 0;
	}
	
	public Point getCenter() {
		return center;
	}

	@Override
	public String toString() {
		return "Shape [center = " + center + " ]";
	}
}
