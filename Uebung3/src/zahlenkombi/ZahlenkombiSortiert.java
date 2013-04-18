package zahlenkombi;

import java.util.Arrays;

public class ZahlenkombiSortiert extends Zahlenkombi{
	
	private static int timings;
	private static long start;
	private static long end;
	private static long time;
	
	public ZahlenkombiSortiert(int max) {
		super(max);
	}
	
	@Override public boolean istEnthalten(int zahl){
		super.istEnthalten(zahl);
		start= System.currentTimeMillis();  
    	 
    	if(timings == 0){
    		Arrays.sort(getZahlenArray());
    		end= System.currentTimeMillis();
    		time += end - start;
    		timings++;
    	}
    	 
    	else{
    		
    		Arrays.binarySearch(getZahlenArray(), zahl);
    		end= System.currentTimeMillis();  
    		time += end - start;
    		timings++;
    		return true;
        }
    	return false;
	}
    public void zeitmessung(){

    	System.out.println("Zeit: " + (double) time/timings  + "ms");
    }
}
