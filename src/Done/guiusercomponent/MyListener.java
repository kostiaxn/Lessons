/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.guiusercomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class MyListener implements ActionListener {

    final static public int EXIT = 0;
    final static public int PRINT = 1;
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int code = ((MyComponent) ae.getSource()).getCode();
        if (code == EXIT) {
            System.exit(0);
        }
        else if (code == PRINT) {
            System.out.println("Выводим информацию в консоль...");
        }
    }
    
}
