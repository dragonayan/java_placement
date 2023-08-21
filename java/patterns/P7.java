import java.util.*;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // for (int l = 1; l < i; l++) {
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }

}
