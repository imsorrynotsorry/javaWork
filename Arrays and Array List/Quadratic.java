import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args)
    {
       int sentinelValue = 1;  //give a random value 
       while (sentinelValue != 0)  //while (condition)
       {
                int a, b, c;  //ax^2 + bx + c
                double R, S;
                String root1, root2;
                
                
                Scanner scan = new Scanner(System.in);
                
                System.out.println("\nEnter the coefficient of x squared: ");
                a = scan.nextInt();
                
                System.out.println("Enter the coefficient of x: " );
                b = scan.nextInt();
                
                System.out.println("Enter the constant: " );
                c = scan.nextInt();
                
                double dis = Math.pow(b,2) - (4 * a * c);
                if (dis < 0)  //complex answer
                {
                    R = (-1 * b)/(2*a);
                    S = (Math.sqrt(-1*dis))/(2*a);
                    root1 = "" + R + " + " + S + "i";
                    root2 = "" + R + " - " + S + "i";
                }
                else //works fine
                {
                    root1 = "" + ((-1 * b) + Math.sqrt(dis)) / (2 * a);
                    root2 = "" + ((-1 * b) - Math.sqrt(dis)) / (2 * a);
                }
                
                System.out.println("Root 1: "+ root1);
                System.out.println("Root 2: "+ root2);
                
                System.out.println("\nEnter any number to go again, 0 to quit");
                sentinelValue = scan.nextInt();
       }
    }
}

