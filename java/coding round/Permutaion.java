
class Main {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int func(int m, int n) {
        int d = n - 1;
        int ans1 = m + d;
        int ans2 = fact(ans1);
        int ans3 = fact(m) * fact(d);
        return ans2 / ans3;

    }
}

public class Permutaion {

    public static void main(String[] args) {
        int mango = 3;
        int people = 3;
        // System.out.println(Main.func(mango, people));
        int ans = Main.func(mango, people);
        System.out.println(ans);
    }
}