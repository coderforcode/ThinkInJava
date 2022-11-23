import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
//
//
//        示例 1：
//
//        输入：nums = [1,1,2]
//    1 2 1 1
//    1 1 1 2
//        输出：
//        [[1,1,2],
//        [1,2,1],
//        [2,1,1]]
//        示例 2：
//
//        输入：nums = [1,2,3]
//        输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int[] arr = new int[]{1, 1, 2};
        List<List<Integer>> list = test2.getList(arr);
        list.forEach(System.out::println);
    }

    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> path = new ArrayList<>();

    public List<List<Integer>> getList(int[] arr) {
        int n = arr.length;
        if (n == 0) return res;
        Arrays.sort(arr);
        boolean[] used = new boolean[n];
        backTracking(arr, used);
        return res;
    }

    public void backTracking(int[] arr, boolean[] used) {
        if (path.size() == arr.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        // [1,1,2]
        for (int i = 0; i < arr.length; i++) {
            // 被使用过了，跳到下一个
            if (used[i]) continue;
            path.add(arr[i]);
            used[i] = true;
            backTracking(arr, used);
            // 回到上一层
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
