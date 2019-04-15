import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Polygon extends Shape{

	public Polygon(Color color, boolean filled)
	{
		super(color, filled);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		int[] x = new int[location.length];
		int[] y = new int[location.length];
		
		for(int i = 0; i < location.length; ++i)
		{
			x[i] = (int)location[i].getX();
			y[i] = (int)location[i].getY();
			
		}
		
		g.drawPolygon(x, y, location.length);
		if(this.isFilled()) {
		g.setColor(this.getColor()); 
		g.fillPolygon(x, y, location.length);
		
		}
		
		
	}
}
