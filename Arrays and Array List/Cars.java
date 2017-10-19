
public class Cars
{
    public int wheels, year;
    public String make, model, trim, color;
    
    public Cars(int y, String mk, String mdl, String t, String c) //default constructor
    {
        this.wheels = 4;
        this.year = y;
        this.make = mk;
        this.model = mdl;
        this.trim = t;
        this.color = c;
    }

    public Cars(int w, int y, String mk, String mdl, String t, String c)
    {
        this.wheels = w;
        this.year = y;
        this.make = mk;
        this.model = mdl;
        this.trim = t;
        this.color = c;
    }
    
    public String toString()
    {
        return "" + this.year + " " + this.make + " " + this.model; 
    }
}
