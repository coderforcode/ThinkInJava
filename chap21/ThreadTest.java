public class ThreadTest {
    public static void main(String[] args) {
     int a = 10;
     int b = 0;

     Thread t1 = new Thread(() -> {
         System.out.println("t1");
            int res = a / b;
        });
        t1.setName("t1");

     t1.setUncaughtExceptionHandler((t, e) -> {
            System.out.println(" t1.setUncaughtExceptionHandler " + Thread.currentThread().getName());
            System.out.println(t + ":" + e);
        });

        t1.start();
    }
}