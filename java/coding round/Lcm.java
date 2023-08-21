import java.util.*;

public class Lcm {
    public static int gcd(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        while (min > 1) {
            if (max % min == 0)
                return min;
            else {
                min = max % min;
            }
           

        } return 1;

    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        int ans = b / gcd(a, b) * a;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = lcm(num1, num2);
        System.out.println(ans);
    }

}
