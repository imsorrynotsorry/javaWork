//sets up the Person.class file 
public class Person
{
    //fields
    public String name, lastName;
    public int age;
    public char gender;
    private boolean married;  //either true or false

    /**
     * Constructor for objects of class Person
     */
    //overloading Person() constructor
    public Person()
    {
        this.name = "First Name";
        this.lastName = "Last Name";
        this.age = 17;
        this.gender = 'f';
        this.married = false;
    }
    public Person(String n, String ln)
    {
        this.name = n;        
        this.lastName = ln;
        
        this.age = 17;   //as default
        this.gender = 'f';   //as default
        this.married = false;  // as default
    }
    public Person(String n, String ln, int a, char g, boolean m)
    {
        super();
        this.name = n;
        this.lastName = ln;
        this.age = a;
        this.gender = g;
        this.married = m;
    }
    
    public void Birthday()
    {
        this.age ++;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    
    public char getGender()
    {
        return this.gender;
    }
    
    public boolean isMarried()
    {
        return this.married;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public void setLastName(String ln)
    {   
        this.lastName = ln;
    }
    
    //there is a method built in called toString()
    //override toString() method
    public String toString()
    {
        return (this.name + " " + this.lastName + " is " + this.age + " years old.");
    }
    

}
