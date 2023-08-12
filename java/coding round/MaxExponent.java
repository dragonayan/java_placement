import java.util.*;

class Test {
    public static int count(int a) {
        int c = 0;
       while(a % 2 == 0) {
            a = a / 2;
            c++;
        }
       
        return c;

    }

    public static int func(int m, int n) {
        int max = 0;
        for (int i = m; i <= n; i++) {
            int ans = count(i);
            max = Math.max(max, ans);

        }
        
        return max;

    }
}

public class MaxExponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = sc.nextInt();
        int lower = sc.nextInt();
        int ans1 = Test.func(upper, lower);
        System.out.println(ans1);
    }
}
