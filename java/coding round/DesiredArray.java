
import java.util.*;

class Ans {
    public static int func(int[] arr, int n, int k) { // 2345
        int j = 2, count = 0;
        int sum = 0;
        while (j > 0) {
            int m = 0;
            for (int i = 0; i < n; i++) {
                if (j % arr[i] == 0) {
                    break;
                }
                if (j % arr[i] != 0) {
                    m++;
                }
                if (m == n) {
                    count++;
                    sum += j;
                }

            }
            if (count == k-1)
                break;
            j++;
        }
        return sum + 1;

    }
}

public class DesiredArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = Ans.func(arr, size, k);
        System.out.println(sum);
    }
}
