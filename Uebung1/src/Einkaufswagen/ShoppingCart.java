package Einkaufswagen;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;

import Einkaufswagen.CartItem;

public class ShoppingCart {
	ArrayList<CartItem> Einkaufswagen= null;

	public ShoppingCart(){
		Einkaufswagen= new ArrayList<CartItem>();
	}
	
	public void add(CartItem item){
		Einkaufswagen.add(item);		
	}
	
	public double getTotalCost(){
		double totalCost = 0;
		
		for ( CartItem listenInhalt : Einkaufswagen ){
			totalCost += listenInhalt.getCost();
		}
		
		return totalCost;
	}
	 
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(CartItem itemDesWagens : Einkaufswagen){
			sb.append(System.getProperty("line.separator") + "  " + itemDesWagens.toString() + "\n");
		}
		Formatter formatter= new Formatter(new Locale("de", "DE"));
		sb.append(System.getProperty("line.separator") + System.getProperty("line.separator") + 
														 "Summe:\t\t\t\t\t\t\t\t" + formatter.format("%,10.2f", getTotalCost()));
		formatter.close();
			
		return sb.toString();
	}	
}

