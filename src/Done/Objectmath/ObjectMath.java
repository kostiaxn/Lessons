/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Objectmath;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Admin
 */
public class ObjectMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.cos(1));
        System.out.println(Math.sin(1));
        System.out.println(Math.tan(1));
        System.out.println(Math.sin(30 * Math.PI / 180));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.round(5.4));
        System.out.println(Math.ceil(5.01));
        System.out.println(Math.floor(5.99));
        System.out.println(Math.random());
        BigDecimal bd = new BigDecimal(5.87858);
        System.out.println(bd.setScale(3, RoundingMode.HALF_UP));
        System.out.println((new BigDecimal(5.87858)).setScale(3, RoundingMode.HALF_UP));
        int i = (int) (1 + Math.random() * 10);
        System.out.println(i);
    }
    
}
