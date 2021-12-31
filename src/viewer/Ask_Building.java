package viewer;

import java.util.ArrayList;
import java.util.Scanner;

import Player.Player;

public class Ask_Building implements PlayerInput
{
	private Player player;
	
	public Ask_Building(Player p)
	{
		this.player = p;
	}
	@Override
	public String prompt() 
	{
		return String.format("%s what would you like to build?\nA Boat or a Lair?", this.player.get_name());
	}

	@Override
	public String scan() 
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  

		ArrayList<String> options = new ArrayList<String>();
		options.add("Lair");
		options.add("Boat");
		
		String choice = "";
		
		boolean valid = false;
		
		for(int i=0; !valid; i++)
		{
			// Ensure the player picks an actual option.
			for(choice=""; !options.contains(choice); )
			{
//				for(String c:options)
//					System.out.printf("%s ", c);
				
				System.out.printf("\nPlayer %s: ", this.player.get_name());
				
				choice = sc.nextLine();
			} // end correct color loop.
			
			if(options.contains(choice))
				valid = true;
			
			else
				System.out.printf("%s\n", this.prompt());

			
		} // end player color selection loop.
		

		return choice;
	}

	@Override
	public String get_input() 
	{
		System.out.printf(this.prompt());
		
		return this.scan();
	}

}
