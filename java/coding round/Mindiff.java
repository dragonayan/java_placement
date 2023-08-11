public class Mindiff {
    public static int func(int n1, int n2) {
        int diff = 0;
        int count = 0;

        while (n1 != 0 && n2 != 0) {
            if (n1 >= n2) {
                diff = n1 - n2;
                n1 = diff;
                count = count + 1;
               
            } else if (n2 > n1) {
                diff = n2 - n1;
                n2 = diff;
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;
        System.out.println(func(n1, n2));

    }
}