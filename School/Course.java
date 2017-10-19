
/**
 * Write a description of class Course here.
 *
 * @author jay baltz (represent!)
 * @version 1 duh
 */
public class Course
{
    public static Student[] list = new Student[6];  //Here is my array
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
    
    public static void printClassRoster(int index)
    {
        printer("Name:  " + list[index].getName());
        printer("ID Number:  " + list[index].getStudentIDasString(list[index].getID()));
        printer(" ");
    }
    
    public static void main(String[] args)
    {
        list[0] = new Student("Dude", "Lebowski", 1);
        list[1] = new Student("Walter", "Sobchak", 2);
        list[2] = new Student("Donny", "Kerabatsos", 3);
        list[3] = new Student("Maude", "Lebowski", 4);
        list[4] = new Student("Bunny", "Lebowski", 5);
        list[5] = new Student("Jeffrey", "Lebowski", 6);
        
        for (int i = 0; i < list.length; i ++)
        {
            printClassRoster(i);
        }
    }
}
