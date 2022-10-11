/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.guimenu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class MyListener implements ActionListener {
    
    JFrame frame;
    
    public MyListener(JFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        String c = ae.getActionCommand();
        if (c.equals("Выход")) {
            System.exit(0);
        }
        else if (c.equals("Жёлтый")) {
            frame.getContentPane().setBackground(Color.YELLOW);
        }
        else if (c.equals("Синий")) {
            frame.getContentPane().setBackground(Color.BLUE);
        }
    }
    
}
