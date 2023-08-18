import java.util.Scanner;

public class NumberOfCarries {

    public static int func(int m, int n) {
        int sum = 0, count = 0;
        while (m > 0 || n > 0) {
            int r1 = m % 10;
            int r2 = n % 10;
            sum += (r1 + r2);
            if (sum > 9) {
                count++;
            }
            sum = sum / 10;
            m = m / 10;
            n = n / 10;

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = func(m, n);
        System.out.println(ans);
    }
}
