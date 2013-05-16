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
	
 
	public int scale(){ 
		return (int) (this.scale * dp.getWidth());
	}
	
 
	public int mChartX(){
		return (dp.getHeight()/2) - (scale()/2);
	}
	public int mChartY(){
		return (dp.getWidth()/2) - (scale()/2);
	}
	
	
	public Point setLabelCoords(double wStart, double wEnde, String label, Graphics2D g){
		int centerX = dp.getHeight()/2;
		int centerY = dp.getWidth()/2;
		int winkelHaelfte = (int) (wStart + wEnde/2);
		int radius = scale()/2;
		
	
		Point textCoords = new Point();
		textCoords.x = (int) (centerX + radius * Math.cos(Math.toRadians(winkelHaelfte)) * 1.1);
		textCoords.y = (int) (centerY - radius * Math.sin(Math.toRadians(winkelHaelfte)) * 1.1);
		
	
		FontMetrics fm = g.getFontMetrics();
		if(textCoords.x < centerX){
			Rectangle2D rect = fm.getStringBounds(label, g);
			textCoords.x -= rect.getMaxX();
		}
		return textCoords;
	}
	
 
	public void draw(){
		Graphics2D g = dp.getGraphics();
		
 
		int sum = 0;
		
		for(Double i : values)
			sum += i;
 
		
 
		double wStart = 0;  
		for(int i=0; i<values.length; i++){
			
			 
			double wEnde = (360 * this.values[i]) / sum;  
			g.setColor(this.colors[i]);
			g.fillArc(mChartX(), mChartY(), scale(), scale(), (int) wStart, (int) wEnde);
			
			 
			String label = labels[i] + "(" + values[i] + ")";
			Point p = setLabelCoords(wStart, wEnde, label, g);
			g.setColor(this.colors[i]);
			g.drawString(label, p.x, p.y);
			

			wStart += wEnde; 
		}
	}
}