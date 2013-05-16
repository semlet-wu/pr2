package medien;


public class Zeitschrift extends Medium{
	
	private int nummer;
	
	
	public Zeitschrift(String titel, int erscheinungsJahr, int nummer){
		super.setErscheinungsJahr(erscheinungsJahr);
		super.setTitel(titel);
		this.nummer= nummer;
	}
	
	
	public int getNummer(){
		return this.nummer;
	}
	
	@Override public int getLeihFrist(){
		return 7;
	}
	
	
	public void setNummer(int nummer){
		if(nummer < 1)
			throw new IllegalArgumentException("Die Nummer muss mindestens 1 sein");
		else
			this.nummer= nummer;
	}
	
	
	@Override public String toString(){
		return super.getTitel() + " (" + this.nummer + "/" + super.getErscheinungsJahr() + ") ";
	}
}







