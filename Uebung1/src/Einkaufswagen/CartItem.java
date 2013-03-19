package Einkaufswagen;



public class CartItem {
	private String name; 
	private int quantity;
	private double pricePerUnit;
	
	public CartItem(String name, int quantity, double pricePerUnit){
		this.name = name; //uebergebenen Wert in die privaten Variablen schreiben
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	public double getCost(){
		double itemCost = pricePerUnit * quantity;
		return itemCost;
	}
	public void setQuantity(int quantity){
		if (quantity < 1) {
			quantity = 1;
		}
		this.quantity = quantity;		
	}
	public String toString(){
		return " " + this.name + this.pricePerUnit;
	}
}
