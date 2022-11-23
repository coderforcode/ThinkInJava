import java.util.*;

public class VolatileTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Set<Integer> integers = new HashSet<>(list);
        Aobing aobing = new Aobing();
        aobing.start();
        while (true) {
            if (aobing.isFlag()) {
                System.out.println("有点东西");
            }
        }
    }
}

class Aobing extends Thread {
    private volatile boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag=" + flag);
    }
}
