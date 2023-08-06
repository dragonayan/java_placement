import java.util.Scanner;
import java.util.*;

public class Question2 {

    public static int func(int n) {
        int a = 2;
        for (int i = 2; i <= n; i++) {
            a += i * 2 + (i - 1);

        }
        return a%10000007;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = func(n);
        System.out.println(ans);
    }
}
