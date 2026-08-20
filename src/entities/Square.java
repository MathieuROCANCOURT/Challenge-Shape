/**
 * 
 */
package entities;

/**
 * 
 */
public class Square extends Shape {
	private int side;

	public Square(int side, int x, int y) {
		super(x, y);
		setSide(side);
	}

	public Square(int side) {
		this(side, 0, 0);
	}

	public int getX() {
		return this.getCenter().getX();
	}

	public void setX(int x) {
		this.getCenter().setX(x);
	}

	public int getY() {
		return this.getCenter().getY();
	}

	public void setY(int y) {
		this.getCenter().setX(y);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if (side < 0)
			this.side = 1;
		else
			this.side = side;
	}
}
