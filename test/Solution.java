import java.util.*;

class Solution {
    public static void main(String[] args) {
        String s = minWindow("cabwefgewcwaefgcf", "cae");
        System.out.println(s);
        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put()
        Integer[] array =new Integer[list.size()];
        int[] ints = new int[]{2};
        list.toArray(array); // fill the array


    }

    public static String minWindow(String s, String t) {
        int i = 0;
        String res = "";

        for (int j = 0; j < s.length(); j++) {
            while (i <= j && isContains(s.substring(i, j + 1), t)) {
                res = s.substring(i, j + 1);
                i++;
            }
        }
        System.out.println(i);
        return res;
    }

    public static boolean isContains(String str, String t) {
        int[] array = new int[1000];
        for (int i = 0; i < str.length(); i++) {
            array[str.charAt(i) - 'A']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (array[t.charAt(i) - 'A'] == 0) return false;
            else {
                array[t.charAt(i) - 'A']--;
            }
        }
        return true;
    }
}