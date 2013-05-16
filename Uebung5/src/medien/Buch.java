package medien;


public class Buch extends Medium{

	private String verlag;
	private String autor;
	
	
	public Buch(String titel, int erscheinungsJahr, String verlag, String autor){
		super.setErscheinungsJahr(erscheinungsJahr);
		super.setTitel(titel);
		this.verlag= verlag;
		this.autor= autor;
	}
	
	
	public String getVerlag(){
		return this.verlag;
	}
	
	public String getAutor(){
		return this.autor;
	}
	
	@Override public int getLeihFrist(){
		return 28;
	}
	
	
	public void setVerlag(String verlag){
		if(verlag == null || verlag.equals(" "))
			throw new IllegalArgumentException("Verlag darf nicht leer sein");
		else
			this.verlag= verlag;
	}
	
	public void setAutor(String autor){
		if(autor == null || autor.equals(" "))
			throw new IllegalArgumentException("Verlag darf nicht leer sein");
		else
			this.autor= autor;
	}
	
	@Override public String toString(){
		return this.autor + ": " + super.getTitel() + " (" + super.getErscheinungsJahr() + ") " + this.verlag;
	}
}
