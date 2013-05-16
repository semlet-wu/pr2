package zweiDGrafik;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

import com.bjp.DrawingPanel;

public class Tortendiagramm {

	private double[] values;	 
	private Color[] colors;		 
	private String[] labels;	 
	private double scale;		 
	private DrawingPanel dp;	 
	
 
	public Tortendiagramm(double[] values, Color[] colors, String[] labels, double scale, DrawingPanel dp){
		this.values = values;
		this.colors = colors;
		this.labels = labels;
		this.scale = scale; 
		this.dp = dp;
	}
	
 
	public int setScaleFactor(){ 
		return (int) (this.scale * dp.getWidth());
	}
	
 
	public int middleChartX(){
		return (dp.getHeight()/2) - (setScaleFactor()/2);
	}
	public int middleChartY(){
		return (dp.getWidth()/2) - (setScaleFactor()/2);
	}
	
	
	public Point setLabelCoords(double winkelstart, double winkelende, String label, Graphics2D g){
		int mittelpunktX = dp.getHeight()/2;
		int mittelpunktY = dp.getWidth()/2;
		int winkelhaelfte = (int) (winkelstart + winkelende/2);
		int radius = setScaleFactor()/2;
		
	
		Point labelCoords = new Point();
		labelCoords.x = (int) (mittelpunktX + radius * Math.cos(Math.toRadians(winkelhaelfte)) * 1.2);
		labelCoords.y = (int) (mittelpunktY - radius * Math.sin(Math.toRadians(winkelhaelfte)) * 1.2);
		
	
		FontMetrics fm = g.getFontMetrics();
		if(labelCoords.x < mittelpunktX){
			Rectangle2D rect = fm.getStringBounds(label, g);
			labelCoords.x -= rect.getMaxX();
		}
		return labelCoords;
	}
	
 
	public void draw(){
		Graphics2D g = dp.getGraphics();
		
 
		int gesamtwert = 0;
		for(Double i : values)
			gesamtwert += i;
 
		
 
		double winkelstart = 0;  
		for(int i=0; i<values.length; i++){
			
			 
			double winkelende = (360 * this.values[i]) / gesamtwert;  
			g.setColor(this.colors[i]);
			g.fillArc(middleChartX(), middleChartY(), setScaleFactor(), setScaleFactor(), (int) winkelstart, (int) winkelende);
			
			 
			String label = labels[i] + "(" + values[i] + ")";
			Point p = setLabelCoords(winkelstart, winkelende, label, g);
			g.setColor(this.colors[i]);
			g.drawString(label, p.x, p.y);
			

			winkelstart += winkelende; 
		}
	}
}