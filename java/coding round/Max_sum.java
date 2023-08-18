import java.util.*;

public class Max_sum {
    public static int maxSum(int[] arr, int size) { // -2, -3, 4 ,-1, -2, 5, -3
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(sum, max);
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
