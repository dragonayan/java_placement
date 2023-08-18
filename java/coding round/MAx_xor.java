import java.util.*;

public class MAx_xor {
    public static int maxSum(int[] arr, int size) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size ; i++) {
            int sum = 0;
            int sum1 = 0;
            for (int j = i; j < size; j++) {
                sum ^= arr[j];
                sum1 += arr[j];
                if (sum == sum1) {
                    int length = j - i + 1;
                    max = Math.max(max, length);
                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxSum(arr, size);
        System.out.println(ans);
    }
}
