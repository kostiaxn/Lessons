package Array;

public class ArrayHW {
    public static void main(String[] args) {
        double[] arr = new double[5];
        arr[0] = 10.1;
        arr[1] = 5.1;
        arr[2] = 30.1;
        arr[3] = 10.1;
        arr[4] = 12.1;
        double sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println(sum);


        double summa = 1;
        for (i = 0; i < arr.length; i++) {
            summa = summa * arr[i];
        }
        System.out.println(summa);
    }
}
