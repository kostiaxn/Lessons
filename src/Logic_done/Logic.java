package Logic_done;

public class Logic {
    public static void main(String[] args) {
        boolean b_1 = true; // 1
        boolean b_2 = false; // 0
        System.out.println(b_1 + " && " + b_2 + " = " + (b_1 && b_2)); // логическое "и" = 1 * 0
        System.out.println(b_1 + " || " + b_2 + " = " + (b_1 || b_2)); // логическое "или" = 1 + 0
        System.out.println(b_1 + " ^ " + b_2 + " = " + (b_1 ^ b_2)); // исключающие  "или" = истина, когда значения различные
        System.out.println("!" + b_1 + " = " + !b_2); // инвертирует значение, если было true, станет false
        System.out.println();




        // Задание
        System.out.println("Задание");
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println(a && !(b && c));
        System.out.println(!a || (b && c));
        System.out.println(!a ^ !(b && c));
    }
}
