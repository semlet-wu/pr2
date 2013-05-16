package medien;


public class CD extends Medium{
	
	private String kuenstler;
	private int gesamtspielzeit;
	
	
	public CD(String titel, int erscheinungsJahr, String kuenstler, int gesamtspielzeit){
		super.setTitel(titel);
		super.setErscheinungsJahr(erscheinungsJahr);
		this.kuenstler= kuenstler;
		this.gesamtspielzeit= gesamtspielzeit;
	}
	

	public String getKuenstler(){
		return this.kuenstler;
	}
	
	public int getGesamtspielzeit(){
		return this.gesamtspielzeit;
	}
	
	@Override public int getLeihFrist(){
		return 14;
	}

	public void setKuenstler(String kuenstler){
		if(kuenstler == null || kuenstler.equals(" "))
			throw new IllegalArgumentException("Kuenstler muss angegeben werden");
		else
			this.kuenstler= kuenstler;
	}
	
	public void setGesamtspielzeit(int gesamtspielzeit){
		if(gesamtspielzeit <= 0)
			throw new IllegalArgumentException("Die Gesamtspielzeit darf nicht 0 oder kleiner sein");
		else
			this.gesamtspielzeit= gesamtspielzeit;
	}
	

	@Override public String toString(){
		return this.kuenstler + ": " + super.getTitel() + " (" + super.getErscheinungsJahr() + ") " + this.gesamtspielzeit + " Minuten";
	}
	
}
