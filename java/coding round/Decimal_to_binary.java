import java.util.ArrayList;
import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while (n >= 1) {
            int rem = n % 2;
            arr.add(rem);
            n = n / 2;

        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
