
/**
 * Write a description of class ForLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoops
{
    

    public static void printer(String str)
    {
        System.out.println(str);
    }
   
    public static void main(String[] args)
    {
        for (int i = 0; i < 25; i ++)
        {
            printer("Number: " + (i + 1));
            printer("Perfect Square: " + (int) Math.pow(i, 2));
        }
        
        
        printer(" ");

        
        int count = 0;
        while(count < 25)
        {
            printer("Number: " + (count + 1));
            printer("Perfect Square: " + (int) Math.pow(count, 2));
            count++;
        }
    }
}
