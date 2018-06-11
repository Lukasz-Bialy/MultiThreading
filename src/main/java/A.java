public class A {
    public static int iczba = 0;

    public static void run() {
        count();
    }

    private static void count() {
        for (int i = 0; i < 100; i++) {
            iczba += 1;
            System.out.println(iczba);
        }
    }
}
