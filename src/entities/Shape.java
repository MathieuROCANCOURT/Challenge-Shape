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
	
	/*--- Accesseurs ---*/
	
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point localCenter) {
		center = localCenter;
	}

	@Override
	public String toString() {
		return "Shape [center = " + center + " ]";
	}
}
