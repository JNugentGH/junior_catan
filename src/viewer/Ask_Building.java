package viewer;

import Player.Player;

public class Ask_Building extends Get_Input
{
	public Ask_Building(Player p)
	{
		super(p);
		
		this.add_option("Lair");
		
		this.add_option("Ship");
		
		this.set_prompt(this.player_name() + " what would you like to build?\n");
	}
}
