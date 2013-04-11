package ballspiel;

public class Beachsoccer extends Fussball{
	
	@Override public int getSpieldauer(){
		return 36;
	}
	@Override public String einwurfRegel(){
		return super.einwurfRegel() + " Ausfuehrung innerhalb von 5 Sekunden!";
	}
	
	@Override public String eckRegel(){
		return super.eckRegel() + " Ausfuehrung innerhalb von 5 Sekunden!";
	}
	

}
