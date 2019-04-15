import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle {

	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled) 
	{
		super (pointLB, color, filled);
		//the point on the base not apart of the right angle
		location[0] = pointLB;
		//the point at the right angle
		location[1] = new Point (pointLB.x+ base, pointLB.y);
		//the point above the right angle
		location[2] = new Point(pointLB.x + base/2, (pointLB.y - height));
	}

}
