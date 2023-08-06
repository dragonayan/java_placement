import java.util.Scanner;

public class Question3 {

    public static void func(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    break;
                }
            }

        }
        arr[n - 1] = -1;
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        func(arr, size);
    }
}
