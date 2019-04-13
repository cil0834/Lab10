import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
/**
 * An abstract class that determines the color of a shape, whether the shape is filledm and the locaiton of the
 * shape. Implements the Drawable interface
 * @author Caleb
 *
 */
public abstract class Shape implements Drawable{


	private Color color;
	private boolean filled;
	protected Point[] location;
	
	public Shape(Color color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	//abstract draw method
	public abstract void draw(Graphics g);
	
	public Color getColor()
	{
		return color;
	}
	
	public Point[] getLocation()
	{
		return location;
	}
	
	public boolean isFilled()
	{
		return filled;
	}

}
