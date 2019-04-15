import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame{
	
	private Diamond d = new Diamond(new Point(150, 50), 50, Color.GREEN, true);
	private Rectangle r = new Square (new Point(400, 400), 50, Color.ORANGE, true);
	private Triangle rt = new RightTriangle(new Point (200, 200), 50, 75, Color.BLUE, true);
	private Triangle it = new IsoscelesTriangle(new Point (300, 300), 50, 75, Color.BLACK, true);
	private PolyLine pl = new PolyLine(new Point (500, 300), new Point (600, 250), 10, Color.CYAN, true);
	private Circle c = new Circle(new Point(359, 350), 20, Color.DARK_GRAY, true);
	private Oval o = new Oval(new Point (100, 100), 20, 40, Color.PINK, true);
	
	
	
	public DrawFrame() 
	{
		DrawPanel shapePanel = new DrawPanel();
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(shapePanel);
		this.pack();
		shapePanel.addShape(d);
		shapePanel.addShape(r);
		shapePanel.addShape(rt);
		shapePanel.addShape(it);
		shapePanel.addShape(pl);
		shapePanel.addShape(c);
		shapePanel.addShape(o);
	}
	
	public static void main(String[] args) {
		
		new DrawFrame();
				
		
	}
}
