import java.util.ArrayList;
/**
 * Write a description of class ArrayListPractice here.
 *
 * @author jay baltz (represent!)
 * @version 1 duh
 */
public class ArrayListPractice
{
    public static ArrayList<Student> list = new ArrayList<Student>();
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
    
    public static void printClassRoster(Student temp)
    {
        printer("Name:  " + temp.getName());
        printer("ID Number:  " + temp.getStudentIDasString(temp.getID()));
        printer(" ");
    }
    
    public static void main(String[] args)
    {
        list.add(new Student("Dude", "Lebowski", 1));
        list.add(new Student("Walter", "Sobchak", 2));
        list.add(new Student("Donny", "Kerabatsos", 3));
        list.add(new Student("Maude", "Lebowski", 4));
        list.add(new Student("Bunny", "Lebowski", 5));
        list.add(new Student("Jeffrey", "Lebowski", 6));
        
        for (Student temp : list)
        {
            printClassRoster(temp);
        }
    }
}
