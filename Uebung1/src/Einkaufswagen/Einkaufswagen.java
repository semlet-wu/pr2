package Einkaufswagen;

import Einkaufswagen.CartItem;
import Einkaufswagen.ShoppingCart;

public class Einkaufswagen {


	public static void main(String[] args) {
		ShoppingCart einkaufsTuete = new ShoppingCart();
		
		CartItem hundeFutter   = new CartItem("Hundefutter", 4, 3.2);
		CartItem kruemelKeks   = new CartItem("Kekse", 4, 1.59);
		CartItem flascheMilch  = new CartItem("Flasche Milch", 1, 0.69);
		CartItem glasMarmelade = new CartItem("Erdbeerkonfituere", 3, 2.19);
		
		einkaufsTuete.add(hundeFutter);
		einkaufsTuete.add(kruemelKeks);
		einkaufsTuete.add(flascheMilch);
		einkaufsTuete.add(glasMarmelade);
		
		hundeFutter.setQuantity(6);
		
		//double summaSumarum = einkaufsTuete.getTotalCost();
		//System.out.println(summaSumarum);
		
		System.out.println(einkaufsTuete.toString());
	}

}
