
public class Zoo
{
    public static void main(String[] args)
    {
        Cat c = new Cat("Bill");
        c.sleep();
        c.speak();
        System.out.println(c.getName());
        
        Dog d = new Dog();
        d.sleep();
        d.speak();
    }
}
