package ballspiel;

public class Ballspiel_Main {

	
	public static void main(String[] args) {
		Ballspiel s = new Ballspiel();
		
		System.out.println("Ballspiel: ");
		System.out.println("  Mannschaften: " + s.getMannschaften());
		System.out.println("  Spieldauer  : " + s.getSpieldauer());
		System.out.println("  Baelle      : " + s.getBallzahl());
		
		Fussball f = new Fussball();
		
		System.out.println("Fussball: ");
		System.out.println("  Mannschaften : " + f.getMannschaften());
		System.out.println("  Spieldauer   : " + f.getSpieldauer());
		System.out.println("  Baelle       : " + f.getBallzahl());
		System.out.println("  Einwurf      : " + f.einwurfRegel());
		System.out.println("  Ecke         : " + f.eckRegel());
		
		Handball h = new Handball();
		
		System.out.println("Handball: ");
		System.out.println("  Mannschaften : " + h.getMannschaften());
		System.out.println("  Spieldauer   : " + h.getSpieldauer());
		System.out.println("  Baelle       : " + h.getBallzahl());
		System.out.println("  Zeitstrafe   : " + h.zeitstrafeRegel());
		
		Jonglieren j = new Jonglieren();
		
		System.out.println("Jonglieren: ");
		System.out.println("  Mannschaften : " + j.getMannschaften());
		System.out.println("  Spieldauer   : " + j.getSpieldauer());
		System.out.println("  Baelle       : " + j.getBallzahl());
		System.out.println("  Einwurf      : " + j.lernRegel());
		
		Beachsoccer b = new Beachsoccer();
		
		System.out.println("Beachsoccer: ");
		System.out.println("  Mannschaften : " + b.getMannschaften());
		System.out.println("  Spieldauer   : " + b.getSpieldauer());
		System.out.println("  Baelle       : " + b.getBallzahl());
		System.out.println("  Einwurf      : " + b.einwurfRegel());
		System.out.println("  Ecke         : " + b.eckRegel());
		

	}

}
