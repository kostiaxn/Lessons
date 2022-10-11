
package Done.GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class GUI {


    public static void main(String[] args) {

        JFrame frame = new JFrame("Моя программа");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(size);
        //frame.setBounds(0, 0, size.width, size.height);
        frame.setLocation(0, 0);
        frame.setSize(size);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
