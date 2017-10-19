
/**
 * Abstract class Animal - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Animal
{
    public void printer(String str)
    {
        System.out.println(str);
    }
    public void sleep()
    {
        printer("zzzzzzzzzzz");
    }
    public abstract void speak();
}
