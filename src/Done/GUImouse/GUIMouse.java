/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.GUImouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class GUIMouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Моя программа");        
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("Клик мыши");
                System.out.println(me.getX() + " - " + me.getY());
                if (me.getButton() == MouseEvent.BUTTON1) {
                    System.out.println("Клик левой кнопки мыши");
                }
                else if (me.getButton() == MouseEvent.BUTTON3) {
                    System.out.println("Клик правой кнопки мыши");
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //System.out.println("Кнопка мыши нажата");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //System.out.println("Кнопка мыши отпущена");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //System.out.println("Курсор мыши над контейнером");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //System.out.println("Курсор мыши ушёл с контейнера");
            }
            
        });
        
        frame.setVisible(true);
    }
    
}
