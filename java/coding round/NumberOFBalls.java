import java.util.*;

class Ans {
    public static int func(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int k = (i + 1) * (i + 1);
            int ans = k - arr[i];
            sum += ans;
        }
        return sum;
    }
}

public class NumberOFBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Ans.func(arr, size);
        System.out.println(ans);
    }
}