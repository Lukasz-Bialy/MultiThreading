public class Number implements Runnable {

     Klient kl1 = null;

    public Number(Klient kl1) {
        this.kl1 = kl1;
    }

    public void run() {
        callNumber();
    }

    synchronized private void callNumber() {
        while (kl1.liczba < kl1.n)
            kl1.check(false, false);
    }


}
