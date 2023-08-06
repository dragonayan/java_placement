public class Max_occurance {
    public static int max(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > c && b > d) {
            return b;
        } else if (c > d) {
            return c;
        } else {
            return d;
        }
    }

    public static void main(String[] args) {
        int a = 100, b = 15;
        int c = 120, d = 25;
        int asn = max(a, b, c, d);
        System.out.println(asn);

    }

}
