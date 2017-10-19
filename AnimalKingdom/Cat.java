
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Animal implements Playable
{
    public void printer(String str)
    {
        System.out.println(str);
    }
    public void speak()
    {
        printer("Meowwww");
    }
    public void play()
    {
        printer("let's go play with some dead birds!");
    }
}
