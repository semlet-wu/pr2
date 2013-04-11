package ballspiel;

public class Beachsoccer extends Fussball{
	
	@Override public int getSpieldauer(){
		return 36;
	}
	@Override public String einwurfRegel(){
		return "Einwurf erlaubt, er darf in die Hand genommen werden! Ausfuehrung innerhalb von 5 Sekunden!";
	}
	
	@Override public String eckRegel(){
		return "Ecke! Mindestabstand 9,15 m! Ausfuehrung innerhalb von 5 Sekunden!";
	}
	

}
