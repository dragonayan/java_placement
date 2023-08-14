import java.util.*;

public class TowerOFHanoi {
    public static void func(int n, char a, char c, char b) {
        if (n == 0) {
            return;
        }
        func(n - 1, a, b, c);
        System.out.println("move " + (n) + " disks " + " from " + a + " to " + c);
        func(n - 1, b, c, a);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n, 'A', 'C', 'B');
    }
}