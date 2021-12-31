package viewer;

import java.util.ArrayList;
import java.util.Scanner;

import Player.Player;

public class Get_Action implements PlayerInput
{
	private Player player;
	
	public Get_Action(Player p)
	{
		this.player = p;
	}
	
	@Override
	public String prompt() {
		return String.format("%s What would you like to do?\nBuild or Trade.\n", this.player.get_name());
	}

	@Override
	public String scan() 
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  

		ArrayList<String> options = new ArrayList<String>();
//		options.add("Roll");
		options.add("Build");
		options.add("Trade");
		
		String choice = "";
		
		boolean valid = false;
		
		for(int i=0; !valid; i++)
		{
			// Ensure the player picks an actual option.
			for(choice=""; !options.contains(choice); )
			{
//				for(String c:options)
//					System.out.printf("%s ", c);
				
//				System.out.printf("\nPlayer %s: ", i+1);
				
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
