import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 糖小样的皮卡丘
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("hello", "你好");
    }
}
