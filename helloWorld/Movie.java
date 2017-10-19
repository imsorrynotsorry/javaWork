
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    private int rating;
    private String title;
    
    public Movie()
    {
       rating = 0;
       title = "Test!";
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public int getRating()
    {
        return rating;
    }
    
    public void setRating(int r)
    {
        rating = r;
    }
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
   
    public static void main(String[] args)
    {
        
    }
}
