import java.util.*;

public class UniqueMatrix {
    public static boolean func(int[][] arr, int m, int n) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for (int i = 0; i < m; i++) {
            h1.clear();
            h2.clear();

            for (int j = 0; j < m; j++) {
                h1.add(arr[i][j]);
                h2.add(arr[j][i]);

            }
            if (h1.size() != h2.size()) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean ans = func(arr, m, n);
        if (ans) {
            System.out.println("TRue");
        } else {
            System.out.println("False");
        }
    }
}