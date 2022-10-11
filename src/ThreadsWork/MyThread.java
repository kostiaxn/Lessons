/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsWork;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MyThread implements Runnable {
    
    MyObject obj;
    
    public MyThread(MyObject obj) {
        this.obj = obj;
    }
    
    public void run() {
        synchronized(obj) {
            obj.x = 0;
            for (int i = 0; i < 5; i++) {
                obj.x++;
                System.out.println(Thread.currentThread() + " obj.x = " + obj.x);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
