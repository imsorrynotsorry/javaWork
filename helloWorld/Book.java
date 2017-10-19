
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private double price;
    private String title, author;
    
    public Book(String t, String a, double p)
    {
       this.price = p;
       this.title = t;
       this.author = a;
    }
    
    public String getTitle()
    {
        return title  + " by " + author;
    }
    
    public void setTitle(String t, String a)
    {
        title = t;
        author = a;
    }
    

    
    public static void printer(String str)
    {
        System.out.println(str);
    }
   
    public static void main(String[] args)
    {
        
    }
}
