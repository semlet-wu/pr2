package zweiDGrafik;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import com.bjp.DrawingPanel;

public class ZweiDGrafik{
	
	private static DrawingPanel panel = new DrawingPanel(400, 400);
	private static Graphics g = panel.getGraphics();
	public static void main(String[] args){
		eins();
	}
	
	public static void eins(){
		String str = "Programmieren II";
		Graphics2D g2 = (Graphics2D) g;
	
		FontMetrics fm = g2.getFontMetrics();
		Rectangle2D b = fm.getStringBounds(str, g2);
		
		
		int x = 100;
		int y = 100;
		int xy = -15;
		b.setFrame(xy, xy, 130, 20);
		
		g2.translate(x, y);
		for (int i = 0; i < 8; i++){
			g2.draw(b);
			g2.drawString(str, 0, 0);
			g2.rotate(Math.PI/4, x, y);
		}			
	}
}