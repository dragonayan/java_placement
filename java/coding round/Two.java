import java.util.*;

public class Two {
    public static int two_four(int n) {
        long count = 0;
        
        for (long i = 248; i <= n; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(2, 0);
            map.put(4, 0);
            map.put(8, 0);

            long currNumber = i;
            while (currNumber > 0) {
                int d = (int) currNumber % 10;
                if (map.containsKey(d))
                    map.put(d, map.get(d) + 1);
                currNumber /= 10;
            }

            if (map.get(2) >= 1 && map.get(2) == map.get(4) && map.get(4) == map.get(8)) {
                count++;
            }
        }
        return (int) (count % 1000000007);
    }

    public static void main(String[] args) {
        int n = 9899;
        System.out.println(two_four(n));
    }
}
