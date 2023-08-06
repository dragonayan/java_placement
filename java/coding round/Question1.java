import java.util.Scanner;
import java.util.*;

public class Question1 {
    public static void func(int[] arr, int n) {
        // code
        int[] odd = new int[n / 2];
        int[] even = new int[n / 2 + 1];
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[x] = arr[i];
                x++;
            } else if (i % 2 != 0) {
                odd[y] = arr[i];
                y++;
            }
        }
        Arrays.sort(odd);
        for (int i : odd) {
        System.out.print(i);

        }
        System.out.println();
        Arrays.sort(even);
        for (int i : even) {
        System.out.print(i);
        }

        int o = odd.length;
        int e = even.length;
        System.out.println();
        System.out.println(odd[o - 2] + even[e - 2]);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2=sc.
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        func(arr, n);

    }
}
