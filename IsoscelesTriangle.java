import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle {

	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled) 
	{
		super (pointLB, color, filled);
		//the point at the left base
		location[0] = pointLB;
		//the point at the right of the left base
		location[1] = new Point (pointLB.x + base, pointLB.y);
		//the point at the highest height above the base
		location[2] = new Point(pointLB.x + base/2, (pointLB.y - height));
	}

}
