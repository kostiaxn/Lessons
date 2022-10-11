/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Recursion;

/**
 *
 * @author Admin
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(5)); // 1*2*3*4*5=120
    }
    
    public static int factorial(int x) {
        if (x == 1) return 1;
        return factorial(x - 1) * x;
    }
    
}
