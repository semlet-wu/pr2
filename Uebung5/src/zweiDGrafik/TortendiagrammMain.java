package zweiDGrafik;

import java.awt.Color;


import com.bjp.DrawingPanel;

public class TortendiagrammMain {

	public static void main(String[] args) {
		
		double[] values = {15.4, 33.1, 50.3, 27, 13.7};
		Color[] colors = {Color.black, Color.blue, Color.red, Color.green, Color.orange};
		String[] labels = {"Schwarz", "Blau", "Rot", "Gruen", "Orange"};
		double scale = 0.7;
		DrawingPanel dp = new DrawingPanel( 500,500 );
		
		Tortendiagramm tg= new Tortendiagramm(values, colors, labels, scale, dp);
		tg.draw();
	}
}