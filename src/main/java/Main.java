
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Klient kl1 = new Klient();

        Thread t1 = new Thread(kl1);


        t1.start();
        Thread.sleep(1000);
        kl1.flag = true;
        Thread.sleep(1000);
        kl1.flag = false;
        // System.out.println(kl1.liczba);
       /* A klasa = new A();
        long i = System.currentTimeMillis();
        A.run();
        A.run();
        System.out.println((System.currentTimeMillis() - i));*/
    }
}
