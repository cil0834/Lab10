import java.awt.Color;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JFrame;

public class DrawFrame extends JFrame{
	//six circles
	//seven triangles
	//four diamonds
	//two rectangles
	//one sinusoid
	private DrawPanel shapePanel;
	private Diamond d1 = new Diamond(new Point(150, 50), 50, Color.GREEN, true);
	private Diamond d2 = new Diamond(new Point (700, 900), 100, Color.CYAN, true);
	private Diamond d3 = new Diamond(new Point(600, 600), 100, Color.DARK_GRAY, true);
	private Diamond d4 = new Diamond(new Point(200, 500), 40, Color.BLACK, false);
	private Rectangle r1 = new Square(new Point(400, 400), 50, Color.ORANGE, true);
	private Rectangle r2 = new Square(new Point (700, 100), 50, Color.RED, true);
	private Triangle t1 = new RightTriangle(new Point (200, 200), 50, 75, Color.BLUE, true);
	private Triangle t2 = new IsoscelesTriangle(new Point (300, 300), 50, 75, Color.BLACK, true);
	private Triangle t3 = new RightTriangle(new Point (400, 400), 100, 60, Color.GREEN, true);
	private Triangle t4 = new IsoscelesTriangle(new Point (250, 250), 25, 25, Color.ORANGE, true);
	private Triangle t5 = new IsoscelesTriangle(new Point (800, 800), 70, 70, Color.GRAY, true);
	private Triangle t6 = new RightTriangle (new Point (900, 900), 50, 50, Color.LIGHT_GRAY, true);
	private Triangle t7 = new RightTriangle(new Point (750, 750), 60, 60, Color.YELLOW, true);
	private PolyLine pl = new PolyLine(new Point (500, 300), new Point (600, 250), 10, Color.CYAN, true);
	private Circle c1 = new Circle(new Point(359, 350), 20, Color.DARK_GRAY, true);
	private Oval c2 = new Oval(new Point (100, 100), 20, 40, Color.PINK, true);
	private Circle c3 = new Circle(new Point (500, 100), 50, Color.BLUE, true);
	private Oval c4 = new Oval(new Point (750, 500), 50, 75, Color.GREEN, true);
	private Oval c5 = new Oval(new Point (200, 800), 100, 50, Color.GRAY, true);
	private Circle c6 = new Circle(new Point (600, 100), 50, Color.CYAN, true);
	private  Sinusoid s0 = new Sinusoid(Color.MAGENTA, new Point(400, 400), 2, 1, 20);
	
	
	public DrawFrame(String title) throws IOException 
	{
		super(title);
		
		shapePanel = new DrawPanel();
		
		shapePanel.addShape(d1);
		shapePanel.addShape(d2);
		shapePanel.addShape(d3);
		shapePanel.addShape(d4);
		shapePanel.addShape(r1);
		shapePanel.addShape(r2);
		shapePanel.addShape(t1);
		shapePanel.addShape(t2);
		shapePanel.addShape(t3);
		shapePanel.addShape(t4);
		shapePanel.addShape(t5);
		shapePanel.addShape(t6);
		shapePanel.addShape(t7);
		shapePanel.addShape(pl);
		shapePanel.addShape(c1);
		shapePanel.addShape(c2);
		shapePanel.addShape(c3);
		shapePanel.addShape(c4);
		shapePanel.addShape(c5);
		shapePanel.addShape(c6);
		shapePanel.addShape(s0);
		
		this.add(shapePanel);
		this.setSize(1000, 1000);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		PanelToImage.makePanelPNGImage(shapePanel, "src/image");
		
	}
	
	public static void main(String[] args) throws IOException {
		new DrawFrame("Images of Shapes");
		
				
		
	}
}
