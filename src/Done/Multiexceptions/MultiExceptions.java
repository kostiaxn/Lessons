/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Multiexceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MultiExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String in_1 = JOptionPane.showInputDialog(null, "Введите положительное число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите положительное число 2");
        try {
            int a = Integer.parseInt(in_1);
            int b = Integer.parseInt(in_2);
            if (a <= 0 || b <= 0) throw new Exception();
            JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Вы не ввели числа!");
            System.out.println(e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Числа отрицательные!");
            System.out.println(e);
        }
        finally {
            System.out.println("Программа завершается!");
        }
    }
    
}
