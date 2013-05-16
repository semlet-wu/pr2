package zweiDGrafik;

import java.awt.Color;


import com.bjp.DrawingPanel;

public class TortendiagrammMain {

	public static void main(String[] args) {
		
		double[] values = {10, 10, 10};
		Color[] colors = {Color.black, Color.blue, Color.red};
		String[] labels = {"schwarz", "Blau", "Rot"};
		double scale = 0.5;
		DrawingPanel dp = new DrawingPanel( 500,500 );
		
		Tortendiagramm tg= new Tortendiagramm(values, colors, labels, scale, dp);
		tg.draw();
	}
}