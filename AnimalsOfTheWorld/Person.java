
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int age;
    private String gender;
    private boolean married;
    
    public Person(String n, int a, String g, boolean m)
    {
       super();
       this.name = n;
       this.age = a;
       this.gender = g;
       this.married = m;
    }
    
    public boolean isFemale()
    {
       if (this.gender.toLowerCase().equals("f"))
       {
           return true;
       }
       else
           return false;
    }
    
    public void Birthday()
    {
        this.age ++;
    }
    
    public boolean isMarried()
    {
        return this.married;
    }
    
    //override the toString method
    public String toString()
    {
        return (this.name + "\nAge: " + this.age + "\n");
    }

}
