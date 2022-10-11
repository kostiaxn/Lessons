/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Objectdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class ObjectDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Date d = new Date();
        System.out.println(d);
        Calendar c = new GregorianCalendar();
        System.out.println(c.getTimeInMillis());
        c.set(1980, 12, 12, 14, 0, 30);
        System.out.println(c.getTimeInMillis());
        c.set(GregorianCalendar.YEAR, 2020);
        c.set(GregorianCalendar.MONTH, 10);
        c.set(GregorianCalendar.DAY_OF_MONTH, 5);
        c.set(GregorianCalendar.HOUR, 22);
        c.set(GregorianCalendar.MINUTE, 15);
        c.set(GregorianCalendar.SECOND, 27);
        System.out.println(c.getTimeInMillis());
        System.out.println(c.get(GregorianCalendar.MONTH));
        
        String date = "15.12.2015 12:00:05";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        d = format.parse(date);
        c.setTime(d);
        System.out.println(c.get(GregorianCalendar.YEAR));
        System.out.println((new SimpleDateFormat("yyyy/MM/dd HH:mm секунд=ss")).format(d));
    }
    
}
