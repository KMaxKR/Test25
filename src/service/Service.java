package service;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Service {

    public void incrementAndGet(int IncrementWIth) {
        ScheduledExecutorService serv = Executors.newScheduledThreadPool(8);
            try {
                for (int i = 0; i < IncrementWIth; i++) {
                    serv.execute(() -> new Contor().Increment());
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("(Thread.sleep)Exception");
            } finally {
                if (serv != null) serv.shutdown();
            }
    }

}
