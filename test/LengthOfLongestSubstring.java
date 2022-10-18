

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class LengthOfLongestSubstring {
    public static void main(String[] args) {
        int pwwkew = lengthOfLongestSubstring("pwwwetrwtreytyutyjfdgsfgkew");
        System.out.println(pwwkew);
        Map<String, Integer> map = new ConcurrentHashMap<>(12);
        map.put("he", 12);
    }

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        if (n <= 1) {
            return n;
        }
        int i = 0, j = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        for (; j < n; j++) {
            boolean flag = isRepeated(s, j, set);
            if (flag == false) {
                res = Math.max(res, j - i + 1);
            } else {
                while (i <= j && isRepeated(s, j, set)) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return res;
    }

    public static boolean isRepeated(String s, int k, Set<Character> set) {
        if (set.contains(s.charAt(k))) {
            return true;
        }
        else set.add(s.charAt(k));
        return false;
    }
}