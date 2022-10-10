/*
        Попросите пользователя ввести неотрицательно целое число через JOptionPane.
         Обработайте некорректные данные (ничего не ввёл, отрицательное число, не целое
        число), выведя соответствующие уведомления об ошибке.
         Вычислите факториал числа, введённого пользователем, используя цикл while.
         Выведите результат пользователю через JOptionPane.
        Примечание: Факториал 0 = 1, факторил 1 = 1, факториал 2 = 1 * 2, факториал 3 = 1 * 2 *
        3, факториал числа n = 1 * 2 * 3 * … * (n – 1) * n.

        */

package CycleWhile;

import javax.swing.*;

public class CycleWhileHW {
    public static void main(String[] args) {

        String in;
        int i = 0;
        in = JOptionPane.showInputDialog(null, "Введите неотрицательно целое число");
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {
                JOptionPane.showMessageDialog(null, "Вы ввели отрицательное число");
            } else {
                int summa = 0;
                i = 0;
                while (i <= n) {
                    summa = n * (n - 1);
                    i++;
                }
                JOptionPane.showMessageDialog(null, "Факториал числа " + n + " = " + summa);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Вы не ввели число");
        }
    }
}
