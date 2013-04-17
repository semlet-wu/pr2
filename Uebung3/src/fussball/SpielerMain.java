package fussball;

import java.util.ArrayList;

public class SpielerMain {


	public static void main(String[] args) {
		ArrayList<Spieler> mannschaft = new ArrayList<Spieler>();
		
		//
		
		mannschaft.add(new Spieler("meier"));
		mannschaft.add(new Spieler("mueller"));
		mannschaft.add(new Spieler("schulze"));
		mannschaft.add(new Spieler("vodka"));
		mannschaft.add(new Spieler("bier"));
		mannschaft.add(new Spieler("obstler"));
		mannschaft.add(new Spieler("pfeffi"));
		mannschaft.add(new Spieler("korn"));
		mannschaft.add(new Spieler("escoreal"));
		mannschaft.add(new Spieler("averna"));
		mannschaft.add(new Spieler("sambuca"));
		mannschaft.add(new Spieler("promille ->"));
		

		System.out.println(mannschaft.toString());
		
		
		
	}

}
