
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    public String face;
    public String suit;
    public String name;
    public int value;
    public int aceValue = 14;
    public int jackValue = 11;
    public int queenValue = 12;
    public int kingValue = 13;
    public Deck()
    {
       aceValue = 14;     //these are specific to the game
       jackValue = 11; 
       queenValue = 12;
       kingValue = 13;
       this.value = 0;
       this.face = "f";
       this.suit = "s";
       this.name = this.face + " of " + this.suit;
    }
    public Deck(int i)
    {
       aceValue = 14;     //these are specific to the game
       jackValue = 11; 
       queenValue = 12;
       kingValue = 13;
       
       setupDeck(i);
    }
    
    public void setAceValue(int val)
    {
        aceValue = val;
    }
    
    public void setJackValue(int val)
    {
        jackValue = val;
    }
    
    public void setQueenValue(int val)
    {
        queenValue = val;
    }
    
    public void setKingValue(int val)
    {
        kingValue = val;
    }
    
    public void setupDeck(int i)
    {
        int quotient = i / 13;  //quotient will be either 0, 1, 2, 3 ... suits
        int remainder = i % 13;  //remainder will be 0 through 12 ... faces
        
        switch (remainder)
        {
            case 0:  this.face = "Ace";  this.value = aceValue; break;
            case 1:  this.face = "Two";  this.value = 2; break;
            case 2:  this.face = "Three";  this.value = 3; break;
            case 3:  this.face = "Four";  this.value = 4; break;
            case 4:  this.face = "Five";  this.value = 5; break;
            case 5:  this.face = "Six";  this.value = 6; break;
            case 6:  this.face = "Seven";  this.value = 7; break;
            case 7:  this.face = "Eight";  this.value = 8; break;
            case 8:  this.face = "Nine";  this.value = 9; break;
            case 9:  this.face = "Ten";  this.value = 10; break;
            case 10:  this.face = "Jack"; this.value = jackValue; break;
            case 11:  this.face = "Queen"; this.value = queenValue; break;
            case 12:  this.face = "King"; this.value = kingValue; break;
            default:  break;
        }
        
        switch (quotient)
        {
            case 0: this.suit = "Diamonds"; break;
            case 1: this.suit = "Hearts"; break;
            case 2: this.suit = "Spades"; break;
            case 3: this.suit = "Clubs"; break;
            default: break;
        }
        
        this.name = this.face + " of " + this.suit;
    }
    
}
