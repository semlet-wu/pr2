package Einkaufswagen;

import java.util.ArrayList;
import Einkaufswagen.CartItem;

public class ShoppingCart {
	ArrayList<CartItem> Einkaufswagen= new ArrayList<CartItem>();
	
	public ShoppingCart(){
		
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
	//Stringbuilder?!
	//Das geht auch ohne getter, zur Uebung aber mal mit programmiert.
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for (CartItem a : Einkaufswagen){		
		sb.append(a.getQuantity() + " x " + 
				  a.getName() + " \t\t\t" + 
				  a.getpricePerUnit() + " \t" + 
				  a.getCost() + " \n");
		}
		return sb.toString();
	}
	
}
