
/**
 * Write a description of class PersonTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonTester
{
    
    public PersonTester()
    {
       
    }
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
    
    public static void main(String[] args)
    {
        Student p1 = new Student("Jane Doe", 23, 'f');
        Student p2 = new Student("John Doe", 24, 'm');
        p1.setPoints(4,5);
        printer(p1.getGrade());
        p1.addAssignment(5, 5);
        printer(p1.getGrade());

    }
}
