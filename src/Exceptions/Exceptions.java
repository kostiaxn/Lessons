package Exceptions;

import java.util.Arrays;

public class Exceptions {
    public static void main(String[] args) {
        Integer[] arr = {534, 256, 3351, 5324326, 134, 22, 7, 5, 9867, 10};


        try {
            arr[10] = 5;
            Arrays.sort(arr, Integer::compare);
            for (int a : arr) System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка тут ------- " + e);
        }





    }
}
