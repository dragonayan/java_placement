public class Test {
    public static void main(String[] args) {

        int a = 7, b = 3, c = 4;

        int q = 0;
        for (c = 4; c <= 7; c++) {
            q = (c + c) & c;
            System.out.println(q);
            // int ans = 14 & 7;
            // System.out.println(ans);
        }

        // System.out.println(c);
        // a=(c&1)&b;
        // System.out.println(a+b);
    }

}
