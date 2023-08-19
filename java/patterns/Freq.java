import java.util.*;

public class Freq {
    public static boolean isDone(int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 0);
        mp.put(5, 0);
        mp.put(9, 0);
        int a = n;
        while (a > 0) {
            int r = a % 10;
            if (mp.containsKey(r)) {
                mp.put(r, mp.get(r) + 1);
            }

            a = a / 10;
        }

        if ((mp.get(1) >= 1) && (mp.get(1) == mp.get(5)) && (mp.get(5) == mp.get(9))) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int upper = 1000;
        int count = 0;
        for (int i = 159; i < 915; i++) {
            if (isDone(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
