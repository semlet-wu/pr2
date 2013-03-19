package point_Klasse_erweitern;
import java.awt.Graphics;

// Klasseninvariante: x>=0 und y>=0.

public class Point {
    private int x;
    private int y;

    // Vorbedingung: initialX >= 0 und initialY >= 0.
    public Point(int initialX, int initialY) {
        setLocation(initialX, initialY);
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(Graphics g) {
        g.fillOval(x, y, 3, 3);
        g.drawString("(" + x + ", " + y + ")", x, y);
    }

    // Vorbedingung: newx >= 0 und newy >= 0.
    public void setLocation(int newx, int newy) {
        if (newx < 0 || newy < 0) {
            throw new IllegalArgumentException("x und y müssen >= 0 sein");
        }
        x = newx;
        y = newy;
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    public double distance(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanceFromOrigin() {
        Point origin = new Point();
        return distance(origin);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public int manhattanDistance(Point p){
    	int mD = Math.abs(x - p.x) + Math.abs(y - p.y);
    	return mD;	
    }
    	
}
