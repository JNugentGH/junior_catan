package Viewer;

import board.Board;
import board.Island;
import board.Lair;

public class Draw_Board
{
	public void draw_board()
	{
		Board board = Board.getInstance();
		
		System.out.println(board); // print board to see player count and if it is the one true singleton board.
		for(Island i : board.islands)
		{
			draw_island(i);
		}
	}
	
	public void draw_island(Island island)
	{
		for(Lair lair : island.lairs)
		{
			draw_lair(lair);
		}
	}
	
	public void draw_lair(Lair lair)
	{
		String output;
		
		output = String.format("%s", lair.owner);
		
		System.out.println(output);
	}
	
//	public	static void main(String args[])
//	{
//		
//		draw_board();
//	}
}