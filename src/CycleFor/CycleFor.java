package CycleFor;

public class CycleFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) { // 1. объявление переменной i, 2. условие продолжения цикла (проверка), 4. что происходит после цикла
            System.out.println(i + " "); // 3. выполнение цикла
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) System.out.println(i + " ");
        }
        int summa = 0;
        int n = 10;
        for (int i = 0; i <= n; i += 2) {
            summa += i; // 2+4+6+8+10

        }
        System.out.println();
        System.out.println("Сумма чётных чисел от 0 до " + n + " = " + summa);

    }
}
