import java.util.*;

class Main {
    public static int func(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] a = s.toCharArray();
        int start = 0, end = 0;
        int max = Integer.MIN_VALUE;
        int n = s.length();
        while (end <n) {
            if (!set.contains(a[end])) {
                set.add(a[end]);
            }
            int length = end - start + 1;
            if (length == set.size()) {
                max = Math.max(max, length);
            } else {
                set.remove(start);
                start++;
            }
            end++;
        }
        return max;

    }
}

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int an = Main.func(s);
        System.out.println(an);
    }

}
