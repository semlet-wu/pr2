package medien;


public abstract class Medium implements Comparable<Medium>{
	
	
	private String titel;
	private int erscheinungsJahr;
	

	public String getTitel(){
		return this.titel;
	}
	
	public int getErscheinungsJahr(){
		return this.erscheinungsJahr;
	}

	public void setTitel(String titel){
		if(titel == null || titel.equals(" "))
			throw new IllegalArgumentException("Titel darf nicht leer sein");
		else
			this.titel= titel;
	}
	
	public void setErscheinungsJahr(int erscheinungsJahr){
		if(erscheinungsJahr < 0)
			throw new IllegalArgumentException("Das Erscheinungsjahr muss >= 0 sein");
		else
			this.erscheinungsJahr= erscheinungsJahr;
	}
	
	@Override public abstract String toString();
	

	public abstract int getLeihFrist();
	
	@Override public int compareTo(Medium other){
		Integer i = new Integer(this.getErscheinungsJahr());
		return i.compareTo(other.getErscheinungsJahr());
	}
}










