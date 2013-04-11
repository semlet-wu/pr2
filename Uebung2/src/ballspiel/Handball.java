package ballspiel;

public class Handball extends Ballspiel{
	
	public String zeitstrafeRegel(){
		return "2 Minuten Zeitstrafe!";
	}
	
	@Override public int getSpieldauer(){
		return 60;
	}
}
