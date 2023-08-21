import java.util.*;

public class Man {
    public static boolean isPalindrome(int n) {
        int a = n;
        int d = 0;
        while (a > 0) {
            int r = a % 10;
            d = d * 10 + r;
            a = a / 10;
        }
        if (n == d) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
