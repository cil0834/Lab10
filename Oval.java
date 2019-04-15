import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Oval extends Shape {
	//distance from left to right
	private int diameter1;
	//distance from left to right
	private int diameter2;
	
	public Oval(Point pointUL, int diameter1, int diameter2, Color color, Boolean filled)
	{
		super(color, filled);
		this.diameter1 = diameter1;
		this.diameter2 = diameter2;
		location = new Point[1];
		location[0] = pointUL;
	}
	


	@Override
	//draw the oval
	public void draw(Graphics g) {
		int x = (int)location[0].getX();
		int y = (int)location[0].getY();
		// TODO Auto-generated method stub
		g.drawOval(x, y, this.diameter1, this.diameter2);
		if(this.isFilled() == true)
		{
		g.setColor(this.getColor());
		g.fillOval(x, y, this.diameter1, this.diameter2);
		}
	}
	
	public int getDiameter1()
	{
		return diameter1;
	}
	
	public int getDiameter2()
	{
		return diameter2;
	}
	
	
}
