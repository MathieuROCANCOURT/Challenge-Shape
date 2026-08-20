/**
 * 
 */
package job;

import java.util.Map;
import java.util.HashMap;

import entities.Shape;

/**
 * 
 */
public class IJobImpl implements IJob {
	private Map<Integer, Shape> shapes;

	public IJobImpl() {
		this.shapes = new HashMap<>();
	}

	@Override
	public void addShape(int id, Shape shape) {
		this.shapes.put(id, shape);
	}

	@Override
	public void deleteShape(int id) {
		this.shapes.remove(id);
	}

	@Override
	public Shape getShapeById(int id) {
		return this.shapes.get(id);
	}

	@Override
	public void moveShape(int id, int x, int y) {
		Shape shape = shapes.get(id);
		shape.getCenter().setX(x);
		shape.getCenter().setY(y);
	}

	@Override
	public void drawShape() {
		
	}

	@Override
	public void displayAll() {
		for(Shape shape: this.shapes.values()) {
			System.out.println(shape);
		}
	}

}
