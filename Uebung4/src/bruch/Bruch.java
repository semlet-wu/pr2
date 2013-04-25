package bruch;

public class Bruch {
	
	private int top;
	private int down;
	
	public Bruch(int top){
		setZaehler(top);
		setNenner(1);
		
	}
	public Bruch(int top, int down){
		setZaehler(top);
		setNenner(down);
	}
	public int getZaehler(){
		return this.top;
	}
	public int getNenner(){
		return this.down;
	}
	public void setZaehler(int top){
		this.top = top;
	}
	public void setNenner(int down){
		if(down == 0){
			throw new IllegalArgumentException("Nenner darf nicht 0 sein.");
		}
		else this.down = down;
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
