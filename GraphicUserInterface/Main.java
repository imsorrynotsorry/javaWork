import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener
{
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    
    private Main()
    {
        super("Frame Tutorial - Baltz");   // title of program
        setSize(600, 600);    //1024x768,  800x600
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());
        
        //button 1
        JButton button = new JButton("Click Me");
        button.setActionCommand("button1");
        button.addActionListener(this);
        add(button);
        
        JButton button2 = new JButton("NO CLICK ME!");
        button2.setActionCommand("button2");
        button2.addActionListener(this);
        add(button2);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String name = e.getActionCommand();
        if (name.equals("button1"))
        {
            System.out.println("Button 1 Clicked!");
        }
        else if (name.equals("button2"))
        {
            System.out.println("Button 2 Clicked!");
        }
    }
}