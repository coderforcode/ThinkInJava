import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] agrs) {
		Map<Integer, Object> map = new TreeMap<>();
		map.put(5, new Object());
		map.put(10, new Object());
		map.put(8, new Object());
		map.put(12, new Object());
		System.out.println(map);


		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -1;
			}
		});
		// 新增元素:
		treeMap.put("张三", 20);
		treeMap.put("李四", 18);
		// 遍历元素：
		Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key);
			Integer value = entry.getValue();
			System.out.println(value);
		}

	}
}