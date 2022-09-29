package StaticData;

public class StaticMethod {
    public static void main(String[] args) {
        new MyMath();
        System.out.println("Count = " + MyMath.getCount());
        new MyMath();
        System.out.println("Сложение a + b = " + MyMath.getAdd());
        new MyMath();
        System.out.println("Вычитание a - b = " + MyMath.getDiv());
        new MyMath();
        System.out.println("Умножение a * b = " + MyMath.getMult());
        new MyMath();
        System.out.println("Деление a / b = " + MyMath.getSub());
        new MyMath();
        System.out.println("Count = " + MyMath.getCount());
    }
}
