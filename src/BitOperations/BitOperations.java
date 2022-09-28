package BitOperations;

public class BitOperations {
    public static void main(String[] args) {
            int a = 5;
            int b = 10;
        String s_a = Integer.toBinaryString(a);
        String s_b = Integer.toBinaryString(b);
        System.out.println("s_a = " + s_a);
        System.out.println("s_b = " + s_b);
        System.out.println(s_a + " & " + s_b + " = " + Integer.toBinaryString(a & b));
        System.out.println(s_a + " | " + s_b + " = " + Integer.toBinaryString(a | b));
        System.out.println(s_a + " ^ " + s_b + " = " + Integer.toBinaryString(a ^ b));
        System.out.println("~" + s_a + " = " + Integer.toBinaryString(~a));
        System.out.println("~" + a + " = " + ~a);
        System.out.println(s_a + " >> 1 = " + Integer.toBinaryString(a>>1));
        System.out.println(a + " >> 1 = " + (a>>1));
        System.out.println(s_a + " << 1 = " + Integer.toBinaryString(a<<1));
        System.out.println(a + " << 1 = " + (a<<1));
    }
}
