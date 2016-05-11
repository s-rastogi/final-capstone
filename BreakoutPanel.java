import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Write a description of class BreakoutPanel here.
 * 
 * @author srastogi
 * @version 5/8/15
 */
public class BreakoutPanel extends JPanel implements ActionListener
{
   //dimensions of ball
    private int xball = 250;
    private int yball = 250;
    private int width = 30;
   //the dimensions change
    private int changeX = -5;
    private int changeY = 5;
  //dimensions of the paddle
    private int xpaddle = 500;
    private int ypaddle = 700;
    private int paddleWidth = 120;
    private int paddleHeight = 10;
   
    // boolean variables for key lisitener
   // private boolean leftPressed = false;
   // private boolean rightPressed = false;
    


    /**
     * Constructor for objects of class BreakoutPanel
     */
    public BreakoutPanel()
    {
        setBackground(Color.WHITE);
        setFocusable(true);
        //addKeyListener(this); doesnt work
        Timer timer = new Timer(1000/100, this);
        timer.start();
    }
    
      public void actionPerformed(ActionEvent e){
        change();
    }

    public void change(){
        //my algorithm
        int newleft = xball + changeX;
        int newright = xball + width + changeY;
        int newtop = yball + changeY;
        int newbot = yball + width + changeY;
        if (newtop < 0 )
        {
            changeY *= -1;
        }
        if(newbot > getHeight())
        {
              changeY *= -1;
        }
        if (newleft < 0) { 
            changeX *= -1;
        }
        if (newright > getWidth()) { 
            changeX *= -1;
        }
        
        xball += changeX;
        yball += changeY;
        repaint();
    }
    
    /**
     *paints the different parts(only the ball for now)
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void paintComponent( Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(xball,yball,width,width);
        g.fillRect(xpaddle, ypaddle, paddleWidth, paddleHeight);
    }
    
//     public void keyTyped(KeyEvent e) {}
// 
//     public void keyPressed(KeyEvent e) {
//         if (e.getKeyCode() == KeyEvent.) {
//             leftPressed = true;
//         }
//         else if (e.getKeyCode() == KeyEvent.) {
//             rightPressed = true;
//         }
//        
//     }
// 
//    public void keyReleased(KeyEvent e) {
//         if (e.getKeyCode() == KeyEvent.) {
//             upPressed = false;
//         }
//         else if (e.getKeyCode() == KeyEvent.) {
//             rightPressed = false;
//         }
//  
//         }
    }
