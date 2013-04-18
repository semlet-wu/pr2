package zahlenkombi;

public class ZahlenkombieMitZeitmessung extends Zahlenkombi{
	

	private static long time = 0;
    private static long count = 0;
    private static long start;
    private static long end;

	public ZahlenkombieMitZeitmessung(int max) {
		super(max);
        }
	
	
	@Override public boolean istEnthalten(int zahl){
		
        start = System.currentTimeMillis();

        boolean temp = super.istEnthalten(zahl);
        end = System.currentTimeMillis();
        
        count++;
        time += end-start;
        return temp;
        
    }
	public void zeitmessung(){
		System.out.println("Zeit: " + (double) time/count + "ms");
	}
}
