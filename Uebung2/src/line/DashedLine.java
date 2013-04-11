package line;

import java.awt.Graphics;


public class DashedLine extends Line{
	
	
	int[] dashes = {15, 25};

	public DashedLine(Point a, Point b, int[] dashes) {
		super(a, b);
		this.dashes = dashes;
	}
	
	@Override public void draw(Graphics g){
		

		
		g.drawLine(super.getp1().getX(), super.getp1().getY(), super.getp2().getX(), super.getp2().getY());
	
		
	}
	
	
	
}
