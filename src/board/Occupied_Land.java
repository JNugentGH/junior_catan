package board;

import java.util.ArrayList;

public class Occupied_Land 
{
	ArrayList<Lair> lairs;
	
	ArrayList<Channel> channels;
	
	public Occupied_Land()
	{
		lairs = new ArrayList<Lair>();
		
		channels = new ArrayList<Channel>();
	}
	
	public ArrayList<Lair> add_lair(Lair l)
	{
		// If the Lair is already in the list of occupied land.
		// return before adding it again.
		// Helped resolve duplicate lairs being added.
		for(Lair in: this.get_lairs())
		{
			if(l.equals(in))
				return this.get_lairs();
		}
		
		this.lairs.add(l);
		
		return this.lairs;
	}
	public ArrayList<Lair> get_lairs()
	{
		return this.lairs;
	}
	
	public ArrayList<Channel> add_channel(Channel l)
	{
		this.channels.add(l);
		
		return this.channels;
	}
	
	public ArrayList<Channel> get_channels()
	{
		return this.channels;
	}
	
	public ArrayList<Lair> get_free_lairs()
	{
		ArrayList<Lair> free = new ArrayList<Lair>();
		
		for(Channel c: this.get_channels())
		{
			for(Lair l: c.get_lairs())
			{
				if(!l.is_occupied())
					free.add(l);
			}
		}
		
		return free;
	}
	
	public ArrayList<Channel> get_free_channels()
	{
		ArrayList<Channel> free = new ArrayList<Channel>();
		
		for(Lair l: this.get_lairs())
		{
			for(Channel c: l.get_channels())
			{
				if(!c.is_occupied())
					free.add(c);
			}
		}
		
		return free;
	}
	
	public String toString()
	{
		String message, lair_string="", channel_string="";
		
		for(Lair l: this.lairs)
			lair_string = String.format("%s %2d", lair_string, l.get_id());
		
		
		for(Channel c: this.channels)
			channel_string = String.format("%s %2d", channel_string, c.get_id());
		
		message = String.format("Lairs:\t\t%s\nChannels:\t%s", lair_string, channel_string);
		
		return message;
	}
	
	
}
