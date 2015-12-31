package t;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TestMultiThread2 implements Runnable {

    private static Object o = new Object();

    private static int si = 0;

    private static AtomicInteger flag = new AtomicInteger();

    @Override
    public void run() {
        for (int k = 0; k < 2000000; k++) {
            synchronized(o){
                si++;
            }
        }
        flag.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        TestMultiThread2 t1 = new TestMultiThread2();
        TestMultiThread2 t2 = new TestMultiThread2();
        ExecutorService exec1 = Executors.newCachedThreadPool();
        ExecutorService exec2 = Executors.newCachedThreadPool();
        exec1.execute(t1);
        exec2.execute(t2);
        while (true) {
            if (flag.intValue() == 2) {
                System.out.println("si>>>>>" + si);
                break;
            }
            Thread.sleep(50);
        }


    }

}