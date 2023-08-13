import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = k + 1, d = 0;
        while (a < n) {
            while (a != 0) {
                int r = a % 10;
                if (!present(arr, a)) {
                    break;
                } else if (present(arr, k)) {
                    d = d * 10 + r;

                }
                n = n / 10;
            }
            

        }
    }
}