/**
 * Programme permettant l'affichage de plusieurs formes géométriques
 * 
 * @author El babili - 2023
 * 
 */
package graphic;

import java.awt.Graphics;
import javax.swing.JFrame;

import entities.Circle;
import entities.Point;
import entities.Square;
import job.IJobImpl;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;

	public Graphic() {
		super("Voici nos formes géométriques !");

		IJobImpl panel = new IJobImpl();

		Circle c1 = new Circle(20, 30, 50); // rayon + x + y
		Point p = new Point(100, 150);
		Circle c2 = new Circle(15, p);
		Square s1 = new Square(50, 200, 200); // cote + x + y
		Square s2 = new Square(65, 200, 50);
		Circle c3 = new Circle(30, 300, 300);
		panel.addShape(0, c1);
		panel.addShape(1, p);
		panel.addShape(2, c2);
		panel.addShape(3, s2);
		panel.addShape(4, c3);
		panel.addShape(5, s1);

		add(panel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
