package Done.Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread implements Runnable{

    @Override
    public void run() {
        int delay = (int) (Math.random() * 2000);
        for (int i = 0; i < 3; i++) {
            System.out.println("Новый поток: " + i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
}
