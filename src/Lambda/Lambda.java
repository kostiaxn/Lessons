package Lambda;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        Integer[] arr = {534, 256, 3351, 5324326, 134, 22, 7, 5, 9867, 10};

        Arrays.sort(arr, (i1, i2) -> Integer.compare(i1, i2));

        for (int a : arr) System.out.println(a);

    }

}
