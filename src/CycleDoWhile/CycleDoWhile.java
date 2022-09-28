package CycleDoWhile;

import javax.swing.*;

public class CycleDoWhile {
    public static void main(String[] args) {
        while (true) {
            String in;
            in = JOptionPane.showInputDialog(null, "Введите положительное число");
            int a = Integer.parseInt(in);
            if (a > 0 || in != null || !in.equals("")) break;
            else {
                JOptionPane.showMessageDialog(null,"Вы ввели число меньше 0");continue;
            }
        }
        JOptionPane.showMessageDialog(null, "Cпасибо");
    }
}