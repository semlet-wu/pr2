package ballspiel;

public class Jonglieren extends Ballspiel{
	
	@Override public int getBallzahl(){
		return super.getBallzahl() + 4;
	}
	
	@Override public int getMannschaften(){
		return super.getMannschaften() - 1;
	}
	
	public String lernRegel(){
		return "Ueben, ueben, ueben.";
	}

}
