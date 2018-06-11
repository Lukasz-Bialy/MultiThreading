public class Couple implements Runnable {
    public void run() {
        Klient kli1 = new Klient();
        Klient kli2 = new Klient();
        Thread th1 = new Thread(kli1);
        Thread th2 = new Thread(kli2);
        th1.start();
        th2.start();
    }
}
