package zahlenkombi;

import java.util.ArrayList;
import java.util.Random;

public class ZahlenkombieMitZeitmessung extends Zahlenkombi{
	
	private int[] zahlen;
	private ArrayList<Double> zeitmessungen = new ArrayList<Double>();

	public ZahlenkombieMitZeitmessung(int max) {
		super(max);
		zahlen= new int[10000];
        Random rand= new Random();
        for (int i=0; i<zahlen.length; i++) {
            zahlen[i]= rand.nextInt(max);
        }
	}
	
	@Override public boolean istEnthalten(int zahl){
		
        double start = System.currentTimeMillis();
        
		for (int i=0; i<zahlen.length; i++) {
            if (zahlen[i]== zahl) {
    			double end = System.currentTimeMillis();
    			zeitmessungen.add(end - start);
                return true;
            }
        
        }
        return false;
    }
	public void zeitmessung(){
		double time = 0.0;
		for( double a : zeitmessungen){
			time += a;
		}
		System.out.println("Zeit: " + time/zeitmessungen.size() + "ms");
	}
}
