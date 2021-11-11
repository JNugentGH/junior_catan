package decks;

/* Each Player has one hand,
 * With a resource deck and coco tile deck. */
public class Hand
{
	private Resource_Deck resource_deck;
	
	private Coco_Deck coco_deck;
	
	public Hand()
	{
		this.resource_deck = new Resource_Deck();
		
		this.coco_deck = new Coco_Deck();
	}
}