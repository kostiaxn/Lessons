
package ThreadsWork;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadsWork {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            System.out.println("Новый поток: " + Thread.currentThread());
            for (int i = 0; i < 5; i++) {
                System.out.println("Новый поток: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadsWork.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Новый поток: " + Thread.currentThread());
        });
        t.setName("Мой поток");
        t.setPriority(7);
        //t.start();
        Thread.currentThread().setPriority(3);
        if (t.isAlive()) t.join();
        System.out.println(Thread.currentThread());
        
        MyObject obj = new MyObject();
        for (int i = 0; i < 5; i++) {
            Thread temp = new Thread(new MyThread(obj));
            temp.start();
        }
        
    }
    
}
