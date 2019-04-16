import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class TriangleOfficialTest {
	// (point, base length, height, color, isFilled)
	private Triangle rt = new RightTriangle(new Point(100, 100), 100, 50, Color.ORANGE, true);
	//left point, base length, height, color, isFilled
	private Triangle it = new IsoscelesTriangle(new Point(200, 200), 200, 100, Color.BLUE, false);
	
	@Test
	public void RightTriangleTest()
	{
		//Base of the right angle
		 Assert.assertEquals("Incorrect location for the Triangle", new Point(100, 100), rt.getLocation()[0]);
		//Point above the right angle point
		 Assert.assertEquals("Incorrect location for the Triangle", new Point(100, 150), rt.getLocation()[1]);
		//Point to the left of the right angle point
		 Assert.assertEquals("Incorrect location for the Triangle", new Point(200, 100), rt.getLocation()[2]);
		 //Test color
		 Assert.assertEquals("Incorrect color", Color.ORANGE, rt.getColor());
		 //Test if filled
		 Assert.assertEquals("Triangle filled", true, rt.isFilled());
	}
	
	@Test
	public void IsocelesTriangleTest()
	{
		//Base of the right angle
		 Assert.assertEquals("Incorrect location for the Triangle", new Point(200, 200), it.getLocation()[0]);
		//The point at the right of the left base
		 Assert.assertEquals("Incorrect location for the Triangle", new Point(400, 200), it.getLocation()[1]);
		//The point at the highest height above the base
		 Assert.assertEquals("Incorrect location for the Triangle", new Point(300, 100), it.getLocation()[2]);
		 //Test color
		 Assert.assertEquals("Incorrect color", Color.BLUE, it.getColor());
		 //Test if filled
		 Assert.assertEquals("Triangle filled", false, it.isFilled());
	}

}
