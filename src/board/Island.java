package board;

import java.util.ArrayList;

/*
 * Class to describe an Island, abstract as there will be many Islands defined.
 */
public abstract class Island 
{
	// Island name/letter.
	public String name;
	
	// Enumerate the dice roll of the island.
	// Perhaps import the dice package and its enumerations.
	// rather than the integer.
	public int number;
	
	
	
	// Have the node lairs listed in each island list.
	public ArrayList<Lair> lairs = new ArrayList<Lair>();
	
}
