package medien;

import java.util.*;

public class MedienMain {

	public static void main(String[] args) {
		
		
		Medium[] medien= {
		new Buch("Gesund grillen", 2010, "", "George Forman"),
		new CD("Ein Herz aus Schokolade", 2011, "Die Flippers", 40),
		new Zeitschrift("Linux fuer NOOBZ.", 2005, 17) };
		
		for(Medium m : medien){
			System.out.println(m);
			System.out.println("  Leihfrist: " + m.getLeihFrist());
		}
		
		System.out.println("-----------------------------------");
		Arrays.sort(medien);
		
		for(Medium m : medien){
			System.out.println(m);
		}
		//
		//
		//
		Set<Medium> wildeMischung= new HashSet<Medium>();
		Collections.addAll(wildeMischung,
				new Buch("Building Java Programs - A Back to Basics Approach",2007, "Addison Wesley", "Stuart Reges, Marty Stepp"),
				new CD("Are you Experienced?", 1967, "Jimi Hendrix", 40),
				new Zeitschrift("Der Spiegel", 2010, 3) );
		System.out.println(getMaxErscheinungsjahr(wildeMischung));
		
		
		Set<Buch> buecher= new HashSet<Buch>();
		Collections.addAll(buecher,
				new Buch("Building Java Programs - A Back to Basics Approach",2007, "Addison Wesley", "Stuart Reges, Marty Stepp"),
				new Buch("Java ist auch eine Insel",2009, "Christian Ullenboom", "Galileo Computing"));
		System.out.println(getMaxErscheinungsjahr(buecher));
		
		
		Set<Zeitschrift> zeitschriften= new HashSet<Zeitschrift>();
		Collections.addAll(zeitschriften,
				new Zeitschrift("Der Spiegel", 2009, 12),
				new Zeitschrift("Der Spiegel", 2010, 1),
				new Zeitschrift("Der Spiegel", 2010, 2));
		System.out.println(getMaxErscheinungsjahr(zeitschriften));
	}
	
	public static int getMaxErscheinungsjahr(Set<? extends Medium> buecher) { 
		return Collections.max(buecher, new Comparator<Medium>() { 
			@Override public int compare(Medium a, Medium b) {
				return new Integer(a.getErscheinungsJahr()).compareTo(b.getErscheinungsJahr());
			}
		} ).getErscheinungsJahr();
	}
}
