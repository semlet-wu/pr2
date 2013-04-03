package Einkaufswagen;

import java.util.Formatter;
import java.util.Locale;



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
		StringBuilder sb = new StringBuilder();
		sb.append(quantity + " x " + name);
		int itemNamenLaengenFix = sb.toString().length();
		
		//eklige aber einfache Art die Strings auf die gleiche Laenge zu bringen.
		//die Chars in den Items zaehlen, und auf die Laenge des laengsten Wortes bringen waere schoener.
		
		for (int i = itemNamenLaengenFix; i < 45; i++){
			sb.append(" ");
		}
		
		//Deutschland und zwei Stellen nach dem Komma
		Formatter formatter = new Formatter(new Locale("de", "DE"));
		sb.append(formatter.format("%,10.2f\t%,10.2f", pricePerUnit, getCost()) + "\t"); //API LESEN BRINGT VORTEILE!
		formatter.close();
			
		return sb.toString();
		//return " " + this.name + this.pricePerUnit;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public String getName(){
		return this.name;
	}
	public double getpricePerUnit(){
		return this.pricePerUnit;
	}
}
