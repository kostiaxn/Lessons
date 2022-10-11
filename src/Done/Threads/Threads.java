package Done.Threads;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        /* Thread t = new Thread(new MyThread());
        Thread tl = new Thread(new MyThread());
        tl.start();
        t.start();
        */
        long d = System.currentTimeMillis();
        double s = 0;
        Thread t1 = new Thread(() -> {
            double s1 = 0;
            for (double i = 0; i < 10000000; i++) s1 += 1;
        });
        Thread t2 = new Thread(() -> {
            double s2 = 0;
            for (double i = 0; i < 10000000; i++) s2 += 1;
        });
        t1.start();
        t2.start();
        for (double i = 0; i < 10000000; i++) s += 1;
        if (t1.isAlive()) t1.join();
        if (t2.isAlive()) t2.join();
        System.out.println("Время выполнения программы " + (System.currentTimeMillis() - d));

    }
}
