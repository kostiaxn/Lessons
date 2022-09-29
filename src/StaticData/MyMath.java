package StaticData;

public class MyMath {
    public static int a = 1;
    public static int b = 1;
    private static int count = 0;

    public MyMath(){
        count++;
    }
    public static int getAdd() {
        return (a + b);

            }

    public static int getSub() {
        return (a - b);

    }

    public static int getMult() {
        return (a * b);

    }

    public static int getDiv() {
        return (a / b);

    }

    public static int getCount() {
        return count;
    }
}
