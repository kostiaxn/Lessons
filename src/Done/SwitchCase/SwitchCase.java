package Done.SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 1;
        String s;
        while (true) {
            switch (a) {
                case 1:
                    s = "Один";
                    break;
                case 2:
                    s = "Два";
                    break;
                case 3:
                    s = "Три";
                    break;
                default:
                    s = "Другое число";
            }
            System.out.println(a + " - " + s);
            a++;
            if (a > 4) break;
        }
    }
}
