import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon{

	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled)
	{
		super(color, filled);
		location = new Point[4];
		//upper left
		location[0] = pointUL;
		//upper right
		location[1] = pointUR;
		//lower right lr.y = ur.y + thickness
		location[2] = new Point ((int)pointUR.x, (int)pointUR.y + thickness);
		//lower left  ll.y = ul.y + thickness.
		location[3] = new Point((int)pointUL.x, (int)pointUL.y + thickness);
	}
	
}
