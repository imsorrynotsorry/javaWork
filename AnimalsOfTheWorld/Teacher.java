
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    
    public Teacher(String n, int a, String g, boolean m)
    {
       super(n,a,g,m);  //my parent object.  
    }
    
    //override the toString method in Parent Object
    public String toString()
    {
        if (super.isFemale())
            if (super.isMarried())
                return "Mrs. " + super.toString();
            else
                return "Ms. " + super.toString();
        else
            return "Mr. " + super.toString();
    }
}
