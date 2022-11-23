/**
 * @author 糖小样的皮卡丘
 */
public class ThreadRunTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        thread.run();
    }
}
