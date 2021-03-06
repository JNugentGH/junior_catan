package controller;

import java.util.ArrayList;

import Player.Player;
import cards.Cutlass;
import cards.Goat;
import cards.Gold;
import cards.Molasses;
import cards.Resource;
import cards.Wood;
import decks.Resource_Deck;


public abstract class  Trade_Turn extends Turn
{
	protected Resource trade;
	
	public Trade_Turn(Player p)
	{
		//TODO: constructor 
		super(p);
		this.trade= this.set_trade();
	}
	
	public Resource set_trade() //what resources are being requested
	{
		//Resource trade = new Resource;
		return this.trade;
	}
	
	public Resource get_trade() //what resources are offered to trade
	{
		return this.trade;
	}
	
	public Resource findCard(String a)
	{
		Resource desiredResource = null;
		if (a.equals("Goat"))
			desiredResource = (new Goat());
		
		else if (a.equals("Gold"))
			desiredResource = (new Gold());
		
		else if (a.equals("Molasses"))
			desiredResource = (new Molasses());
		
		else if (a.equals("Wood"))
			desiredResource = (new Wood());
		
		else if (a.equals("Cutlass"))
			desiredResource = (new Cutlass());
		
		return desiredResource;
	}
	
	/*public Resource_Deck get_trade(Player p, Object o) //what resources are being sought
	{
		Resource_Deck trade = new Resource_Deck();

		trade.add(o);
		
		return this.trade;
	}*/
	
	/* Is the player able to afford the trade costs? 
	public boolean check_trade()
	{
		if(this.get_player().get_resource_deck().cards_in(get_trade()))
			return true;
		
		return false;
	}*/
	
	public String toString()
	{
		String message = String.format("Trade Turn.\nTrading:\t%s", this.trade);
		
		return message; 
	}
}
