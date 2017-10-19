import java.util.ArrayList;
/**
 * Write a description of class PersonTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonTester
{
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
   
    public static void main(String[] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Jay", 32, "m", false));
        list.add(new Person("Jesus", 29, "m", false));
        list.add(new Person("Will", 50, "m", true));

        
        Teacher j = new Teacher("Jay Baltz", 32, "m", false);
        Principal p = new Principal("Jason Warren", 40, "m", true);
        
        list.add(j);
        list.add(p);
        
        for(Person people : list)
        {
            printer(people.toString());
        }
        
        
    }
}
