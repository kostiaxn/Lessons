package Done.CycleWhile;

import javax.swing.*;

public class CycleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) { // пока while меньше 100 выполняется цикл в {}
            System.out.println(i + " ");
            i++;
        }
        String in;
        in = JOptionPane.showInputDialog(null, "Введите положительное число");
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            } else {
                int summa = 0;
                i = 1;
                while (i <= n) {
                    summa += i;
                    i++;
                }
                System.out.println("Сумма чисел от 0 до " + n + " = " + summa);
            }
        } else {
            System.out.println("Вы не ввели число");
        }
    }
}
