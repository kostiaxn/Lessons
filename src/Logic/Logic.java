package Logic;

public class Logic {
    public static void main(String[] args) {
        boolean a = true; // 1
        boolean b = false; // 0
        boolean c = false;
        System.out.println(a && !(b && c));
        System.out.println(!a || (b && c));
        System.out.println(!a ^ !(b && c));
    }
}
