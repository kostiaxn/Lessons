/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.GUIusercomponent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class GUIUserComponent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Моя программа");        
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyComponent exit = new MyComponent("Выход", MyListener.EXIT);
        exit.addActionListener(new MyListener());
        
        MyComponent print = new MyComponent("Печать", MyListener.PRINT);
        print.addActionListener(new MyListener());
        
        print.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        exit.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(print);
        panel.add(Box.createVerticalStrut(10));
        panel.add(exit);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
