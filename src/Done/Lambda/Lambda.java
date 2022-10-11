/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Lambda;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arr = {"Hello", "Very long string", "MyWorld", "!"};
        Arrays.sort(arr, new MyCompare());
        for (String s : arr) System.out.println(s);
        System.out.println("-------");
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        for (String s : arr) System.out.println(s);
        
        List<String> arrNew = Arrays.asList("A", "AB", "ABC");
        arrNew.forEach((t) -> {
                System.out.println(t);
            }
        );
        arrNew.forEach(System.out::println);
    }
    
}
