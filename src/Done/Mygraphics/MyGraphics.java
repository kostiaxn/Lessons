
package Done.Mygraphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;


public class MyGraphics extends JFrame {


    public static void main(String[] args) {

        new MyGraphics();
    }
    
    public MyGraphics() {
        super("Графика");
        setBounds(600, 400, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(100, 100, 200, 200);
    }
    
}
