import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> h = new HashSet<>();
        for (int i : arr) {
            h.add(i);
        }
        for (int i : h) {
            System.out.print(i+" ");
        }
    }
}
