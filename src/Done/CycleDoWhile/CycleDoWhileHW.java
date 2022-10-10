/*
Используя бесконечный цикл do-while, заставьте пользователя ввести положительное
целое число.
Примечание: Если пользователь вводит что-то некорректное, то сообщайте ему об этом
и просите снова ввести положительное целое число. И так до бесконечности, пока он не
введёт правильный вариант. Как только он вводит правильный вариант, выходите из
цикла, и выводите JOptionPane с сообщением: «Спасибо!»
 */
package Done.CycleDoWhile;

import javax.swing.*;

public class CycleDoWhileHW {
    public static void main(String[] args) {
        int a_s = 0;
        do { // делаем это
            try { String in;
            in = JOptionPane.showInputDialog(null, "Введите целое положительное число");
            if (in != null && !in.equals("")) {
                a_s = Integer.parseInt(in); } }
            catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Вы ввели текст. Тут ошибка NumberFormatException ");

                if (a_s <= 0) {
                    JOptionPane.showMessageDialog(null, "Вы не ввели положительное целое число");

                }

            }

        } while (a_s < 1);
        JOptionPane.showMessageDialog(null, "Спасибо!");
    }
}