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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShape(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Shape getShapeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moveShape(int id, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub

	}

}
