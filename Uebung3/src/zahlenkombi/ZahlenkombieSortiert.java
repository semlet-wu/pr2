package zahlenkombi;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class ZahlenkombieSortiert extends Zahlenkombi{
	
	private int[] zahlen;
	private static ArrayList<Long> timings = new ArrayList<Long>();
	public ZahlenkombieSortiert(int max) {
		super(max);
		
		zahlen = new int[10000];
		Random rand = new Random();
		
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = rand.nextInt(max);			
		}
	}
	
	@Override public boolean istEnthalten(int zahl){
		
		long start= System.currentTimeMillis();  
    	 
    	if(timings.isEmpty()){
    		Arrays.sort(zahlen);
    		long ende1= System.currentTimeMillis();
    		timings.add(ende1-start); 
    	}
    	 
    	else{
    		
    		Arrays.binarySearch(zahlen, zahl);
    		long ende2= System.currentTimeMillis();  
    		timings.add(ende2-start);  
        	return true;
        }
    	return false;
	}
    public void zeitmessung(){
    	long time = 0;
    	for(Long d : timings){
    		time += d;
    	} 
    	System.out.println("Zeit: " + (double)time/timings.size() + "ms");
    }
}
