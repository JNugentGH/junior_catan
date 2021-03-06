package trading_resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cards.Cutlass;
import cards.Goat;
import cards.Gold;
import cards.Molasses;
import cards.Wood;
import cards.Resource;
import decks.Hand;
import decks.Resource_Deck;


public class Marketplace extends Tradable_Deck{
	
	private int maxCardCount = 5;
	
	private Resource_Deck marketplace;
	
	/* Constructor. Fills up the Marketplace with its starting cards*/
	public Marketplace()
	{
		this.marketplace = new Resource_Deck();
		
		/* moved setup to the Board
		marketplace.add(new Wood());
		marketplace.add(new Goat());
		marketplace.add(new Molasses());
		marketplace.add(new Cutlass());
		marketplace.add(new Gold());
		System.out.println("Marketplace filled up.");*/
	}
	
	
	/* Add a resource card to the stock pile */
	@Override
	public void add_card(Object o) //for trading
	{
		//Resource r = (Resource)o;
		this.marketplace.add(o);
		System.out.printf("%s placed on Marketplace.\n", o);
	}
	
	/* Remove a resource card from the marketplace */
	@Override
	public void remove_card(Object o)
	{
		//Resource r = (Resource)o;
		if(this.marketplace.remove(o))
			System.out.printf("%s removed from Marketplace.\n", o);
	}
	
	//cycle through the deck to check whether it must be updated or not
	public boolean refresh_deck()
	{
		//cycle through all items in marketplace, adding their count
		int totalSize = this.marketplace.size();
		int countGold = 0;
		int countCutlass = 0;
		int countWood = 0;
		int countMolasses = 0;
		int countGoat = 0;
		String gd = "Gold";
		String gt = "Goat";
		String m = "Molasses";
		String c = "Cutlass";
		String w = "Wood";
		
		
		countGold = this.marketplace.toString().split(gd, -1).length-1;
		countGoat = this.marketplace.toString().split(gt, -1).length-1;
		countCutlass = this.marketplace.toString().split(c, -1).length-1;
		countMolasses = this.marketplace.toString().split(m, -1).length-1;
		countWood = this.marketplace.toString().split(w, -1).length-1;
		
		
		if (countGold >= maxCardCount || countCutlass >= maxCardCount || countWood >= maxCardCount || countMolasses >= maxCardCount || countGoat >= maxCardCount)
		{	
			return true;
		}
		
		else
			return false;
	}

	//method to remove all of object o (to place back in marketplace) and refill marketplace from 5 fresh cards
	public void restock(Object o) 
	{
		
		/*for (int i = 0; i<maxCardCount; i++)
		{
			this.marketplace.remove(o);
			System.out.printf("Resource of type %s removed from Marketplace.\n", o);
		}*/ //replaced with better method below
		
		Resource r = (Resource)o;
		
		this.marketplace.remove_all(r);
		System.out.printf("Marketplace is now full and will be restocked.\nAll resources of type %s have been removed from Marketplace.\n", r);
		
		marketplace.add(new Wood());
		marketplace.add(new Goat());
		marketplace.add(new Molasses());
		marketplace.add(new Cutlass());
		marketplace.add(new Gold());
		System.out.println("Marketplace Has Been Freshly Restocked.");
	}
	
	public Resource_Deck get_marketplace()
	{
		return this.marketplace;
	}

	
	public String resource_string()
	{
		return this.marketplace.toString();
	}


}
