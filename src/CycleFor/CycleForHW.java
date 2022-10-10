/*
    Задание
    Попросите пользователя ввести положительное целое число через JOptionPane.
    Обработайте некорректные данные (ничего не ввёл, отрицательное число, 0, не
целое число), выведя соответствующие уведомления об ошибке.
    Вычислите сумму всех чисел от 1 до числа, введённого пользователем, используя
цикл for.
    Выведите результат пользователю через JOptionPane.
    Пример: Пользователь ввёл 7, значит, надо вычислить сумму: 1+2+3+4+5+6+7=?

*/
package CycleFor;


import javax.swing.*;

public class CycleForHW {
    public static void main(String[] args) {
        String a;
        a = JOptionPane.showInputDialog(null, "Введите положительное целое число");
        if (a != null && !a.equals("")) {
            int a_s = Integer.parseInt(a);
            if (a_s <= 0) {
                JOptionPane.showMessageDialog(null, "Вы не ввели положительное целое число");
            } else {
                int summa = 0;
                int n = a_s;
                for (int i = 0; i <= n; i++) {
                    summa += i;
                }
                JOptionPane.showMessageDialog(null, "Сумма чисел от 0 до " + n + " = " + summa);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Вы не ввели число");
        }

    }
}
