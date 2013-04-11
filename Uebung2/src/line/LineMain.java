package line;

import java.awt.Graphics;

import com.bjp.DrawingPanel;


public class LineMain {
	
	public static void main(String[] args) {
		
		picasso();
	
	}
	public static void picasso(){
		Point a = new Point();
		Point b = new Point();
		Line linie = new Line(a, b, 5);
		
		DrawingPanel panel = new DrawingPanel(200, 200);
		Graphics g = panel.getGraphics();
		
		int x=20;
		int y=20;
		
		int x2=200;
		int y2=200;
		
		for (int i = 0; i <= 10; i++) {
			a.setLocation(x*i, 0);
			b.setLocation(0,y*i);
			linie.draw(g);
			
		}
		for (int j = 0; j <= 9; j++) {
			a.setLocation(x2-(x*j),y2);
			b.setLocation(x2,y2-(x*j));
			linie.draw(g);
		}
		System.out.println(linie.toString());
	}
	public static void gestrichelt(){
	//nicht fertig.
	}

}
