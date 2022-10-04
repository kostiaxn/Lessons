package Done.BitOperations;

public class BitOperations {
    public static void main(String[] args) {
            int a = 4;
            int b = 7;
            String s_a = Integer.toBinaryString(a); // преобразование в двоичный код
            String s_b = Integer.toBinaryString(b);
        System.out.println("s_a = " + s_a);
        System.out.println("s_b = " + s_b);
        System.out.println(s_a + " & " + s_b + " = " + (a & b)); // побитовое "и" - умножение
        System.out.println(s_a + " & " + s_b + " = " + Integer.toBinaryString(a & b));
        System.out.println(s_a + " | " + s_b + " = " + Integer.toBinaryString(a | b)); // побитовое "или" - сложение
        System.out.println(s_a + " ^ " + s_b + " = " + Integer.toBinaryString(a ^ b)); // исключающие "или" дает 1 когда значения различные
        System.out.println("~" + s_a + " = " + Integer.toBinaryString(~a)); // инвертация
        System.out.println(s_a + " >>1 = " + Integer.toBinaryString(a>>1)); // побитовый сдвиг вправо, деление на 2
        System.out.println(s_a + " <<1 = " + Integer.toBinaryString(a<<1)); // побитовый сдвиг влево, умножение на 2

        System.out.println();
        System.out.println("Задание");

        int c = 5;
        int d = 10;
        String s_c = Integer.toBinaryString(c);
        String s_d = Integer.toBinaryString(d);
        System.out.println("s_c = " + s_c);
        System.out.println("s_d = " + s_d);
        System.out.println(s_c + " & " + s_d + " = " + Integer.toBinaryString(c & d)); // умножение
        System.out.println(s_c + " | " + s_d + " = " + Integer.toBinaryString(c | d)); // побитовое "или" - сложение
        System.out.println(s_c + " ^ " + s_d + " = " + Integer.toBinaryString(c ^ d)); // исключающие "или" дает 1 когда значения различные
    }
}
