
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public String name;
    public int age, pointsPossible, pointsTotal;
    public char gender;
    public Student()
    {
        this.name = "";
        this.age = 0;
        this.gender = 'g';
        this.pointsPossible = 0;
        this.pointsTotal = 0;
    }
    public Student(String n, int a, char g)
    {
       this.name = n;
       this.age = a;
       this.gender = g;
       this.pointsPossible = 0;
       this.pointsTotal = 0;
    }
    
    public Student(String n, int a, char g, int pT, int pP)
    {
       this.name = n;
       this.age = a;
       this.gender = g;
       this.pointsPossible = pP;
       this.pointsTotal = pT;
    }
    
    public void growOlder()
    {
        this.age = this.age + 1;
    }
    
    public int getPointsPossible()
    {
        return this.pointsPossible;
    }
    
    public void setPointsPossible(int pP)
    {
        this.pointsPossible = pP;
    }
    
        public int getPointsTotal()
    {
        return this.pointsTotal;
    }
    
    public void setPointsTotal(int pT)
    {
        this.pointsTotal = pT;
    }
    
    public void setPoints(int pT, int pP)
    {
        this.setPointsPossible(pP);
        this.setPointsTotal(pT);
    }
    
    public String getGrade()
    {
        double percent = ((double) this.pointsTotal ) / ((double) this.pointsPossible) ;
        percent = percent * 100.0;
        String answer = "" + percent + "%";
        return answer;
    }
    
    public void addAssignment(int pP, int pT)
    {
        this.pointsPossible += pP;
        this.pointsTotal += pT;
    }
    
    public String getName()
    {
       return this.name;
    }
    
    public void setName(String n)
    {
       this.name = n;
    }
    
    public char getGender()
    {
        return this.gender;
    }
    
    public void setGender(char g)
    {
       this.gender = g;
    }
    
    public int getAge()
    {
       return this.age;
    }
    
    public void setAge(int a)
    {
        this.age = a;
    }
    
    public static void printer(String str)
    {
        System.out.println(str);
    }
   
    public static void main(String[] args)
    {
    
    }
}
