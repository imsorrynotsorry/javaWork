public class Cat extends Animal
{
    //fields
    private String name;
    
    //constructor
    public Cat(String n)
    {
        this.name = n;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void speak()
    {
        System.out.println("Meow!");
    }
}
