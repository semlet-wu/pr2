package fussball;

public class Spieler {
	
	
	private String name;
	private int nummer;
	private static int count 		= 1;
	
	public Spieler(String name){
		if(count > 11){
			throw new IllegalStateException("KENNSTE KEINE FUSSBALLREGEN, ODER WAS?");
		}
		this.name 	= name;
		this.nummer = count;
		count++;
		
	}
	
	@Override public String toString(){
		return (name + " (" + nummer + ")");
	}
	
	
	
}
