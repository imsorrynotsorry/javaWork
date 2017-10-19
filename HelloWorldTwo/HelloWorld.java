
/**
 * Write a description of class HelloWorld here.
 * 
 * multiline comments
 *
 * @jbaltz
 * @1
 */
//single line comment
public class HelloWorld
{
    public static void main(String[] args)
    {
        String name = "Mr. Baltz";
        int age = 32;
        char favLetter = 'j';
        double ageDouble = 32.6;
        long ageLong = (long) 32.66;   //casting to a data type
        
        
        System.out.println("Hello ");   //System.out.println( " " ); prints on one line
        System.out.print("Hello2");     //Hello3 should be printed after this
        System.out.print("\t\"Hello3\n");    // use of escape sequence
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
