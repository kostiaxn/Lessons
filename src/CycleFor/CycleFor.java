package CycleFor;

import javax.swing.*;

public class CycleFor {
    public static void main(String[] args) {
        String in;
        in = JOptionPane.showInputDialog(null, "Введите число");

        if (in != null && !in.equals("")) {


            int in_s = Integer.parseInt(in);
            if (in_s > 0) {
                int summa = 0;
                int n = in_s;

                for (int i = 0; i <= n; i++) {
                    summa += i;
                }
                JOptionPane.showMessageDialog(null, "Сумма чисел от 0 до " + n + " = " + summa);
            }

            if (in_s == 0)
                JOptionPane.showMessageDialog(null, "Вы ввели ноль");
            if (in_s < 0)
                JOptionPane.showMessageDialog(null, "Вы ввели отрицательное число");


        } else JOptionPane.showMessageDialog(null, "Вы не ввели число");
    }
}

