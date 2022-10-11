/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Objecthashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class ObjectHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "Michael");
        data.put("city", "Omsk");
        data.put("age", "27");
        System.out.println(data.get("name"));
        System.out.println(data.get("city"));
        System.out.println(data.get("age"));
        System.out.println(data.containsKey("age"));
        System.out.println(data.containsKey("country"));
        System.out.println(data.isEmpty());
        System.out.println(data.size());
        data.put("temp", "value");
        for (Map.Entry<String, String> d : data.entrySet()) {
            String key = d.getKey();
            String value = d.getValue();
            System.out.println(key + " = " + value);
        }
        data.remove("temp");
        System.out.println("----------");
        data.forEach((t, u) -> System.out.println(t + " = " + u));
        System.out.println("----------");
        data.values().remove("Omsk");
        data.forEach((t, u) -> System.out.println(t + " = " + u));
        data.clear();
        System.out.println("----------");
        data.forEach((t, u) -> System.out.println(t + " = " + u));
    }
    
}
