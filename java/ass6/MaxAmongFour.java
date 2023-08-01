public class MaxAmongFour {

    public static int findMax(int a, int b, int c, int d) {
        int max = Math.max(a, Math.max(b, Math.max(c, d)));
        return max;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;
        int num4 = 30;

        int max = findMax(num1, num2, num3, num4);
        System.out.println("The maximum value among " + num1 + ", " + num2 + ", " + num3 + ", and " + num4 + " is: " + max);
    }
}
