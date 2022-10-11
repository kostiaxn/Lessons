/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String in_1 = JOptionPane.showInputDialog(null, "Введите число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите число 2");
        try {
            int a = Integer.parseInt(in_1);
            int b = Integer.parseInt(in_2);
            JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Вы не ввели число!");
            System.out.println(e);
        }
        
    }
    
}
