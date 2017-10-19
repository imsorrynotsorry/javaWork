
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    
    public WeatherConditionals()
    {
       
    }
    
    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;
        boolean cold = false;
        boolean hot = false; 
        boolean snow = false;
        
        String advicePre = "It's safe to go outside, ";
        String advicePost = " degrees and ";
        String advice = advicePre + temperature + advicePost + description + ".";
        
        if (description.equals("windy"))
            windy = true;
        
        if (description.equals("snow"))
            snow = true;
            
        if (temperature < 31)
            cold = true;
        
        if (temperature > 100)
            hot = true;
            
        if (windy || cold)
            advice = "Too windy or cold! Enjoy watching the weather through the window.";
            
        if (hot)
            advice = "Too Hot!  Enjoy watching the egg cook on the sidewalk!";
            
        if (snow)
            advice = "Better head to the grocery store to get some bread and milk!  It's gonna snow!";
            
        
        return advice; 
    }
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
   
    public static void main(String[] args)
    {
        printer(getWeatherAdvice(34, "sunny"));
        printer(getWeatherAdvice(32, "windy"));
        printer(getWeatherAdvice(33, "snow"));
        printer(getWeatherAdvice(30, "snow"));
        printer(getWeatherAdvice(30, "windy"));
        
        String message = "help";
        if (-1 >= 0 && message.substring(-1).equals("help"))
            printer("first case");
        else
            printer("second case");
        
            
            int var1 = 3;
            int var2 = 3;
            boolean resultA = var1.compareTo(var2) == 0;
            boolean resultB = var1.equals(var2);
            boolean resultC = var1.compareTwo((Integer)var2) == 0;
            boolean resultD = var1.equals((Integer)var2);
            boolean resultE = var1 == var2;
        
        printer("var 1   " + resultA );
        printer("var 2   " + var2);
    }
}
