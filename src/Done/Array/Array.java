package Done.Array;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 30;
        arr[3] = 10;
        arr[4] = 12;
        System.out.println("Эллемент с индексом 1 = " + arr[1]);
        double[] d_arr = new double[20];
        for (int i = 0; i < d_arr.length; i++)
            d_arr[i] = Math.random();
        for (int i = 0; i < d_arr.length; i++)
            System.out.println(d_arr[i]);
        String[] s_arr = {"Michael", "Igor", "Jack"};
        for (int i = 0; i < s_arr.length; i++)
            System.out.println(s_arr[i]);
        int max = arr[0]; // присваиваем переменной max индекс из массива, который может быть с наибольшим значением
        for (int i = 1; i < arr.length; i++) { // начинаем перебор массива,
            if (arr[i] > max)
                max = arr[i]; // если arr[i] оказывается больше чем max, тогда присваиваем максимальному его значение max = arr[i]
        }
        System.out.println("Максимальное значение в массиве arr: " + max);
        for (int a : arr) { // цикл for each. перебор всех значений в массиве arr и запись в переменную a
            System.out.println(a);
        }
    }
}
