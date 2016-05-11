import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 * Write a description of class Breakout here
 * 
 * srastogi 
 *5/5/16
 */
public class Breakout extends JFrame
{
    // dimensions
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 1200;
    /**
     * /constructor for the Breakout Class
     */
    public Breakout()
    {
        setTitle("Breakout");
        setSize(WIDTH,HEIGHT);
        BreakoutPanel panel = new BreakoutPanel();
        add(panel,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    /** 
     * creates a new object of Breakout
     */
    public static void main(String[] args)
    {
        Breakout editer = new Breakout();
    }
}
     