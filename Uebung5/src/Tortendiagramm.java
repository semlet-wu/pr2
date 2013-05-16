import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;

import com.bjp.DrawingPanel;

public class Tortendiagramm {

	private double[] values;	// abzubildende Werte
	private Color[] colors;		// Farben
	private String[] labels;	// Beschriftungen
	private double scale;		// skalierfaktor des ganzen Diagramms
	private DrawingPanel dp;	// DrawingPanel auf dem das Diagramm zentriert wird
	
	// Konstruktor
	public Tortendiagramm(double[] values, Color[] colors, String[] labels, double scale, DrawingPanel dp){
		this.values = values;
		this.colors = colors;
		this.labels = labels;
		this.scale = scale; 
		this.dp = dp;
	}
	
	// berechne skalierfaktor (für Länge und Breite der Methode fillArc)
	public int setScaleFactor(){ 
		return (int) (this.scale * dp.getHeight());
	}
	
	// Mittle das Diagramm in X- und Y-Richtung aus ( => X und Y Werte für fillArc)
	public int middleChartX(){
		return (dp.getHeight()/2) - (setScaleFactor()/2);
	}
	public int middleChartY(){
		return (dp.getWidth()/2) - (setScaleFactor()/2);
	}
	
	// Koordinaten für Beschriftungen
	public Point setLabelCoords(double winkelstart, double winkelende, String label, Graphics2D g){
		int mittelpunktX = dp.getHeight()/2;
		int mittelpunktY = dp.getWidth()/2;
		int winkelhaelfte = (int) (winkelstart + winkelende/2);
		int radius = setScaleFactor()/2;

		Point labelCoords = new Point();
		labelCoords.x = (int) (mittelpunktX + radius * Math.cos(Math.toRadians(winkelhaelfte)));
		labelCoords.y = (int) (mittelpunktY - radius * Math.sin(Math.toRadians(winkelhaelfte)));
		
		// Der folgende Codeabschnitt dient dazu, kleine Abstände zwischen Beschriftung und Diagramm zu bringen.
		// Dazu wird in den 4 Quadranten jeweils unterschiedlich gerechnet:
		FontMetrics fm = g.getFontMetrics();
		int wortlaenge = fm.getMaxAdvance() * label.length();
		
		// Rechte Hälfte 
		if((winkelstart >= 0 && winkelstart < 90) || (winkelstart > 270 && winkelstart <= 360)){
			// 0 - 90 --> oberes Viertel
			if(winkelstart >= 0 && winkelstart < 90){
				labelCoords.x += 6;
				labelCoords.y -= 6;
			}
			// 270 - 360 --> unteres Viertel
			if(winkelstart > 270 && winkelstart < 360){
				labelCoords.x += 6;
				labelCoords.x += 6;
			}
		}
		
		// Linke Hälfte
		if(winkelstart >= 90 && winkelstart <= 270){
			// 90 - 180 --> oberes Viertel
			if(winkelstart >= 90 && winkelstart <= 180){
				labelCoords.x -= wortlaenge/3;
			}
			// 180 - 270 --> unteres Viertel
			if(winkelstart > 180 && winkelstart <= 270){
				labelCoords.x -= wortlaenge/3;
				labelCoords.y += fm.getHeight();
			}
		}
		return labelCoords;
	}
	
	// Diagramm zeichnen
	public void draw(){
		Graphics2D g = dp.getGraphics();
		
		// Gesamtwert aufaddieren
		int gesamtwert = 0;
		for(Double i : values)
			gesamtwert += i;
		System.out.println("Gesamtwert: " + gesamtwert);
		
		// Zeichne die Stücke
		double winkelstart = 0; // Start: zeichne erstes Stück beginnend am Winkel 0
		for(int i=0; i<values.length; i++){
			
			// Setze Farbe und zeichne Tortenstück
			double winkelende = (360 * this.values[i]) / gesamtwert; // Winkelende
			g.setColor(this.colors[i]);
			g.fillArc(middleChartX(), middleChartY(), setScaleFactor(), setScaleFactor(), (int) winkelstart, (int) winkelende);
			
			// zeichne Beschriftungen
			Point p = setLabelCoords(winkelstart, winkelende, labels[i] + "(" + values[i] + ")", g);
			g.setColor(this.colors[i]);
			g.drawString(labels[i] + "(" + values[i] + ")", p.x, p.y);
			System.out.println("i: " + i + " winkelstart: " + (int) winkelstart + " Winkelende: " + (int) winkelende + " Teilwert: " + this.values[i] + " Farbe: " + this.labels[i] + " Beschriftungskoordinate x: " + p.x + " y: " + p.y);
			
			// Ende dieses Tortenstücks ist Anfang des nächsten Tortenstücks
			winkelstart += winkelende; 
		}
	}
}