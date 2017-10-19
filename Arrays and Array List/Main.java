import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener
{
    
    public static void main (String[] args)
    {
        new  Main().setVisible(true);
    }
    
    private Main()
    {
        super("Tutorial - Baltz");  //constructor for the jFrame and string is the title
        setSize(600,600); //1024x768,  800x600
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //exitonclose closes the window
        setLayout(new FlowLayout());  //import flow layout
        
        JButton button = new JButton("Click Me");
        button.setActionCommand("button1");
        
        JButton button2 = new JButton("Button 2");
        button2.setActionCommand("button2");
        
        button.addActionListener(this);
        button2.addActionListener(this);
        
        add(button);
        add(button2);
    }
    
    @Override    //after implements action listener
    public void actionPerformed(ActionEvent e)
    {
        String name = e.getActionCommand();
        if (name.equals("button1"))
        {
            System.out.println("Button1 has been clicked");
        }
        else if (name.equals("button2"))
        {
            System.out.println("Button2 has been clicked");
        }
    }
}
