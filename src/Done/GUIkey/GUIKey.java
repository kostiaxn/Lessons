/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.GUIkey;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class GUIKey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Моя программа");        
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                System.out.println("Нажатие клавиши, которая может быть напечатана");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Клавиша нажата");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Клавиша отпущена");
                System.out.println(ke.getKeyCode());
                if (ke.getKeyCode() == 27) System.exit(0);
            }
            
        });
        frame.setVisible(true);
    }
    
}
