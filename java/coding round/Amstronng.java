import java.util.Scanner;

public class Amstronng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String num = Integer.toString(number);
        int n = num.length();
        int d = 0;
        int res = 0;
        int a = number;

        while (number > 0) {
            int r = number % 10;
            res += Math.pow(r, n);
            number = number / 10;

        }
        if (a == res) {
            System.out.println("amstrong number");
        } else {
            System.out.println("Not amstrong");
        }
    }
}
