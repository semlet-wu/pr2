package ballspiel;

public class Fussball extends Ballspiel{
	
	public String einwurfRegel(){
		return "Einwurf erlaubt, der Ball darf in die Hand genommen werden!";
	}
	
	public String eckRegel(){
		return "Ecke! Mindestabstand 9,15 m!";
	}
	
	@Override public int getSpieldauer(){
		return 90;
	}
}
