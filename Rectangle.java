import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{

	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled)
	{
		super(color, filled);
		//upper left corner
		location[0] = pointUL;
		//upper right corner
		location[1] = new Point ((int) (pointUL.getX() + width), (int) (pointUL.getY()));
		//lower left corner
		location[2] = new Point ((int) (pointUL.getX()), (int) (pointUL.getY() + height));
		//lower right corner
		location[3] = new Point ((int) (pointUL.getX() + width), (int) (pointUL.getY() + height));
	}
}
