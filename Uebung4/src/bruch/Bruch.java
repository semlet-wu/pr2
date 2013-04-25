package bruch;

public class Bruch {
	
	private int top;
	private int down;
	
	public Bruch(int top){
		this.top = top;
		this.down = 1;
		
	}
	public Bruch(int top, int down){
		this.top = top;
		
		if(down == 0){
			System.out.println("Der Nenner darf niemals 0 sein, auf 1 gesetzt!");
			this.down = 1;
		}
		else this.down = down;
	
	}
	//
	public int getZaehler(){
		return this.top;
	}
	public int getNenner(){
		return this.down;
	}
	public int setZaehler(int top){
		return this.top = top;
	}
	public int setNenner(int down){
		if(down == 0){
			throw new IllegalArgumentException("Nenner darf nicht 0 sein.");
		}
		else return this.down = down;
	}
	public double ergebnis(){
		return (double) getZaehler() / (double) getNenner();
	}
	@Override public boolean equals(Object o){
		if (o instanceof Bruch) {
			Bruch b = (Bruch) o;
			return (b.getNenner() == this.down && b.getZaehler() == this.top);
		}
		else return false;
	}
	@Override public int hashCode(){
		return this.top / this.down;
	}
}
