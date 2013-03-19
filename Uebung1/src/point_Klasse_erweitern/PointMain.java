package point_Klasse_erweitern;

import point_Klasse_erweitern.Point;

public class PointMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point a = new Point(8, 6);
		Point b = new Point(5, 0);
		
		System.out.println(a.manhattanDistance(b));

	}

}
