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
	public String toString(){
		String liste = null;
		for ( CartItem listenInhalt : Einkaufswagen){
			liste = listenInhalt.toString();
		}
		return liste;
	}
}
