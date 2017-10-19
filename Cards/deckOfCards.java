
/**
 * Write a description of class deckOfCards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deckOfCards
{
    // instance variables - replace the example below with your own
    private int[] deck = new int[52];

    /**
     * Constructor for objects of class deckOfCards
     */
    public deckOfCards()
    {
        // initialise instance variables
        for (int x = 0; x < 52; x ++)
        {
            deck[x] = x;
        }
    }

    
    public static void main()
    {
        
    }
}
