package zahlenkombi;


public class ZahlenkombiMain {
    public static void main(String[] args) {
        //Zahlenkombi kombi= new Zahlenkombi(100000);
        //ZahlenkombieMitZeitmessung kombi = new ZahlenkombieMitZeitmessung(10000);
    	ZahlenkombiSortiert kombi = new ZahlenkombiSortiert(10000);
    	suche(kombi);
        kombi.zeitmessung();
    }
    private static void suche(Zahlenkombi kombi) {
        for (int i=0; i<kombi.getMax(); i++) {
            if (kombi.istEnthalten(i)) {
                System.out.println(i);
                
            }
        }        
    }
}
