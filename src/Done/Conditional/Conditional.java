package Done.Conditional;

import javax.swing.*;

public class Conditional {
    public static void main(String[] args) {
        String a;
        a = JOptionPane.showInputDialog(null, "Введите положительное число");
        if (a != null && !a.equals("")) {
            double a_s = Double.parseDouble(a);
            String b;
            b = JOptionPane.showInputDialog(null, "Введите второе положительное число больше 0");
            if (b != null && !b.equals("")) {
                double b_s = Double.parseDouble(b);
                if (b_s > 0) JOptionPane.showMessageDialog(null, a_s / b_s);
                else {
                    JOptionPane.showMessageDialog(null, "Вы ввели неверное число");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Вы не ввели число");
        }
    }
}