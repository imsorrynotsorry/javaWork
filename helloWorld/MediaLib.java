
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    
    public MediaLib()
    {
       
    }
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
   
    public static void main(String[] args)
    {
        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");
        song1.setRating(5);
        
        Movie movie1 = new Movie();
        movie1.setTitle("Jurassic Park");
        movie1.setRating(5);
        
        Book book1 = new Book();
        book1.setTitle("It", "Steven King");
        book1.setRating(4);
        
        printer("Welcome to your Media Library");
        printer(song1.getTitle() + " with a rating of " + song1.getRating());
        printer(movie1.getTitle() + " with a rating of " + movie1.getRating());
        printer(book1.getTitle() + " with a rating of " + book1.getRating());
    }
}
