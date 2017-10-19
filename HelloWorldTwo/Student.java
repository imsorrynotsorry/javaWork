
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    //fields inside of student are specific to this classification
    private int grade, studentNumber;

    /**
     * Constructor for objects of class Student
     */
    public Student(String n, String ln, int a, char g, boolean m, int gr, int sn)
    {
        super(n,ln,a,g,m);
        this.grade = gr;
        this.studentNumber = sn;
    }
    
    public int getGrade()
    {
        return this.grade;
    }
    
    public void setGrade(int gr)
    {
        this.grade = gr;
    }
    
    public int getStudentNumber()
    {
        return this.studentNumber;
    }
    public String toString()
    {
        return "Name: " + this.name + " " + this.lastName + "\nAge: " + this.age + "\nGrade: " + this.grade + "\nStudent Number: " + this.studentNumber;
    }
}
