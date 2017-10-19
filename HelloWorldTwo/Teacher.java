
public class Teacher extends Person
{
    // instance variables - replace the example below with your own
    private int employeeNumber;
    public String prefix;
    
    
    public Teacher(String n, String ln, int a, char g, boolean m, int en)
    {
        super(n, ln, a, g, m);
        this.employeeNumber = en;
        
        if (this.gender == 'm')
        {
            this.prefix = "Mr. ";
        }
        else   //means that the gender is female
        {
            if (this.isMarried())
            {
                this.prefix = "Mrs. ";
            }
            else  //not married
            {
                this.prefix = "Ms. ";
            }
        }
    }

    public String toString()
    {
        return this.prefix + this.lastName;
    }
}
