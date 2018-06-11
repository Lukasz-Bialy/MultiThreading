import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Klient implements Runnable {

    //volatile long liczba = 0;
    long liczba = 0;
    public boolean flag = false;
    //AtomicInteger liczba = new AtomicInteger(0);

    public void run() {
        while (!flag) {
            long i = System.currentTimeMillis();
            count();

            System.out.println(liczba + " " + Thread.currentThread().getName());
        }
    }

    void add() {
        //liczba.incrementAndGet();
        liczba += 1;
    }

    private void count() {

        add();
        //liczba += 1;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
