/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Lambda;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class MyCompare implements Comparator<String> {

    @Override
    public int compare(String t, String t1) {
        return Integer.compare(t.length(), t1.length());
    }
    
}
