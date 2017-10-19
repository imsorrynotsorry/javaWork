import java.util.ArrayList;
//collection of "cars"
public class Garage extends Cars
{
    public static void pLn(String str)
    {
        System.out.println(str);
    }
    
    public static void printCollection(Cars[] c)
    {
        // for (int count = 0; count < c.length; count++)
        // {
            // pLn(c[count].toString());
        // }
        
        int count = 0;
        while(count < 3)
        {
            pLn(c[count].toString());
            count ++;
        }
        
    }
    
    public static void main(String[] args)
    {
        //Build Array
        Cars[] collection = new Cars[3];
        collection[0] = new Cars(1993, "Ford", "Taurus SHO", "Burgundy");
        collection[1] = new Cars(2003, "Honda", "Accord EX", "Emerald");
        collection[2] = new Cars(2011, "Ford", "Explorer", "Green");
        
        printCollection(collection);
        
        //Build ArrayList
        ArrayList<Cars> col = new ArrayList<Cars>();
        col.add(new Cars(1993, "Ford", "Taurus SHO", "Burgundy"));
        col.add(new Cars(2003, "Honda", "Accord EX", "Emerald"));
        col.add(new Cars(2011, "Ford", "Explorer", "Green"));
        
        // for (Cars temp : col)  //for each loop
        // {
            // pLn(temp.toString());
        // }
        
        
        
    }
}
