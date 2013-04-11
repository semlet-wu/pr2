package line;

import java.awt.Graphics;


public class Line {	
	private Point a = new Point();
	private Point b = new Point();
	private int thickness = 1;
	
	public Line(Point a, Point b, int thickness){
		this.a = a;
		this.b = b;
		this.thickness = thickness;
	}
	public Line(Point a, Point b){
		this.a = a;
		this.b = b;
	}
	
	public Point getp1(){
		return this.a;
	}
	public Point getp2(){
		return this.b;
	}
	public int getThickness(){
		return this.thickness;
	}
	// getter auf getter?! an axe is an axe is an axe is an axe... getterception O_o
	public int getX(Point a){
		return a.getX();
	}
	public int getY(Point a){
		return a.getY();
	}
	public String toString(){
		return "[" + getp1() + ", " + getp2() + ", thickness=" + getThickness() + "]";
	}
	public void draw(Graphics g){
		g.drawLine(getX(a), getY(a), getX(b), getY(b));
	}
	

}
