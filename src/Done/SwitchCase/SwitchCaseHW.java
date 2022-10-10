package Done.SwitchCase;

import javax.swing.*;

public class SwitchCaseHW {
    public static void main(String[] args) {
        String a;
        a = JOptionPane.showInputDialog(null, "Введите первое число");
        if (a != null && !a.equals("")) {
            double a_s = Double.parseDouble(a);
            String b;
            b = JOptionPane.showInputDialog(null, "Введите второе число");
            if (b != null && !b.equals("")) {
                double b_s = Double.parseDouble(b);
                String c;
                c = JOptionPane.showInputDialog(null, "Введите действие");

                    switch (c) {
                        case "+":
                            c = String.valueOf(a_s + b_s);
                            break;
                        case "-":
                            c = String.valueOf(a_s - b_s);
                            break;
                        case "*":
                            c = String.valueOf(a_s * b_s);
                            break;
                        case "/":
                            c = String.valueOf(a_s / b_s);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Вы не ввели действие");
                    }
                    JOptionPane.showMessageDialog(null, c);

            } else {
                JOptionPane.showMessageDialog(null, "Вы ввели неверное число");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Вы не ввели число");
        }
    }

}
