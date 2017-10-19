
/**
 * 
 *
 * @author jay baltz (represent!)
 * @version 1 duh
 */

public class Student
{
    public String firstName, lastName;
    public int studentID;
    
    public Student()
    {
       firstName = "";
       lastName = "";
       studentID = 0;
    }
    
    public Student(String fN, String lN, int sID)
    {
        firstName = fN;
        lastName = lN;
        studentID = sID;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String fN)
    {
        firstName = fN;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lN)
    {
        lastName = lN;
    }
    
    public String getName()
    {
        return getFirstName() + " " + getLastName();
    }
    
    public int getID()
    {
        return studentID;
    }
    
    public void setID(int ID)
    {
        studentID = ID;
    }
    
    //there is probably another way.
    public String getStudentIDasString(int id)
    {
        String prefix = "000";
        if (id < 10)  //single digit
            return prefix + id;
        else if (id < 100)   //two digit
            {
                prefix = "00";
                return prefix + id;
            }
        else if (id < 1000)  //three digit
            {
                prefix = "0";
                return prefix + id;
            }
        else
        {
            return "" + id;
        }
    }
}
