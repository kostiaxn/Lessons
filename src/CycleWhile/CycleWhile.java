package CycleWhile;

import javax.swing.*;

public class CycleWhile {
    public static void main(String[] args) {
        int i = 0;
        String in;
        in = JOptionPane.showInputDialog(null, "Введите положительное число", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            }
            else {
                int summa = 0;
                i = 1;
                while (i <= n) {
                    summa = (n - 1) * n;
                    i++;
                }
                System.out.println("Факториал числа " + n + " = " + summa);
            }
        }
        else {
            System.out.println("Вы не ввели число");
        }
            }
}
