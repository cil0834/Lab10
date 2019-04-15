import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle
{

	public RightTriangle(Point pointRightAngle, int base, int height, Color color, boolean filled) {
		// TODO Auto-generated constructor stub
		super(pointRightAngle, color, filled);
		location[0] = pointRightAngle;
		//point above the right angle
		location[1] = new Point ((int)pointRightAngle.getX(), (int)(pointRightAngle.getY() + height));
		//the point to the right of the rightAngle
		location[2] = new Point ((int)(pointRightAngle.getX() + base), (int)(pointRightAngle.getY()));
	}
	
	
	

}
