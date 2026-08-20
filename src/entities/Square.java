/**
 * 
 */
package entities;

import java.awt.Graphics;

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

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if (side < 0)
			this.side = 1;
		else
			this.side = side;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(super.getX(), super.getY(), this.side, this.side);
	}
}
