
/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    public War()
    {
       
    }
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
   
    public static void main(String[] args)
    {
        Deck[] deck = new Deck[52];
        for (int i = 0; i < deck.length; i ++)
            deck[i] = new Deck(i);
            
        for (int i = 0; i < deck.length; i ++)
            printer(deck[i].name);
    }
}
