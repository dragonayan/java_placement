
import java.util.*;

class FindMaxsum {
    public static int func(int[] arr, int k) {
        int i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE;
        int n = arr.length;
        while (j < n) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(sum, max);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5, 9, 2, 4, 7 };

        // Scanner sc = new Scanner(System.in);
        // int k = sc.nextInt();
        int ans = func(arr, 4);
        System.out.println(ans);
    }
}
// write a function to find the max subarray of size 3 from a array using
// sliding window?