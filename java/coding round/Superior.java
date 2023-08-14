import java.util.Scanner;

public class Superior {
    public static int findSuperior(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
                if (j == n-1) {
                    count++;
                }
            }

        }
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int ans = findSuperior(arr, size);
        System.out.println(ans);
    }
}