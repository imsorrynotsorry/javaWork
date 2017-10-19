public class StudentTester
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher("Jay", "Baltz", 32, 'm', false, 1313);
        Teacher t2 = new Teacher("Jan", "Tyner", 42, 'f', true, 67);
        
        Student s1 = new Student("Jasmine", "Patterson", 17, 'f', false, 12, 48001234);
        
        Person p1 = new Person();
        
        
        System.out.println(p1.name);
        System.out.println(s1.toString());
        System.out.println(t1.toString());
        System.out.println(t2.toString()+"\n");
    }
}
