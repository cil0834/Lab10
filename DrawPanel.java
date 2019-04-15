import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	private ArrayList<Shape> shapeList;
	
	public DrawPanel()
	{
		shapeList = new ArrayList<Shape>();
	}
	
	public void addShape(Shape s)
	{
		shapeList.add(s);
	}
	
	protected void paintComponent(Graphics g)
	{
		for(Shape shapes: shapeList)
		{
			shapes.draw(g);
		}
	}

}
