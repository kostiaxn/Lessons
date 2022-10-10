package CycleDoWhile;

import javax.swing.*;

public class CycleDoWhile {
    public static void main(String[] args) {
        int a = 5;
        while (a > 10) {
            System.out.println("Мы в цикле while!");
        }
        do {
            System.out.println("Мы в цикле do-while!"); // делаем это пока
        } while (a > 10); // не станет больше 10
        a = 0;
        while (true) {
            a++;
            if (a == 10) break;
            if (a % 2 == 0) continue;
            System.out.println(a);
        }
    }
}