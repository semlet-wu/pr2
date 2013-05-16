import java.awt.Color;

import com.bjp.DrawingPanel;


public class TortendiagrammMain {

	public static void main(String[] args) {
		
		double[] values = {10, 10, 10};
		Color[] colors = {Color.black, Color.blue, Color.cyan};
		String[] labels = { "schwarz", "blau", "cyan" };
		double scale = 0.5;
		DrawingPanel dp = new DrawingPanel( 400,400 );
		
		Tortendiagramm tg= new Tortendiagramm(values, colors, labels, scale, dp);
		tg.draw();

	}
}