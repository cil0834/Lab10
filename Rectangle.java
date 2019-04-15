import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{

	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled)
	{
		super(color, filled);
		//upper left corner
		location = new Point[4];
		location[0] = pointUL;
		//upper right corner
		location[1] = new Point (pointUL.x + width, pointUL.x);
		//lower right corner
		location[2] = new Point (pointUL.x + width, pointUL.y + height);
		 //lower left corner
		location[3] = new Point (pointUL.x, pointUL.y + height);
	}
}
