import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;
public class RectangleTestOfficial {
	
 /**
 * A test class for the rectangle shape
 * 
 * @author Caleb Lagge
 * @version April 13, 2019
 * Lab 10
	 */
	@Test
	public void rectangleTest() {
		Rectangle r1 = new Rectangle(new Point(100,100), 50, 100, Color.BLUE, true);
		Square s = new Square(new Point(400, 400), 100, Color.GRAY, false);
		
		//top left point
		 Assert.assertEquals("Incorrect location for the Rectangle", new Point(100, 100), r1.getLocation()[0]);
		 Assert.assertEquals("Incorrect location for the Square", new Point(400, 400), s.getLocation()[0]);
		 //upper right point
		 Assert.assertEquals("Incorrect location for the Rectangle", new Point(150, 100), r1.getLocation()[1]);
		 Assert.assertEquals("Incorrect location for the Square", new Point(500, 400), s.getLocation()[1]);
		 //lower left corner
		 Assert.assertEquals("Incorrect location for the Rectangle", new Point(100, 200), r1.getLocation()[3]);
		 Assert.assertEquals("Incorrect location for the Rectangle", new Point(400, 500), s.getLocation()[3]);
		 //lower right corner
		 Assert.assertEquals("Incorrect location for the Rectangle", new Point(150, 200), r1.getLocation()[2]);
		 Assert.assertEquals("Incorrect location for the Rectangle", new Point(500, 500), s.getLocation()[2]);
		 //test color
	     Assert.assertEquals("Incorrect color for the Rectangle", Color.BLUE, r1.getColor());
	     Assert.assertEquals("Incorrect color for the Square", Color.GRAY, s.getColor());
	     
	     //test is filled
	      Assert.assertEquals("Incorrect flag for filled for the Rectangle", true, r1.isFilled());
	      Assert.assertEquals("Incorrect flag for filled for the Square", false, s.isFilled());
		 
	}

}
