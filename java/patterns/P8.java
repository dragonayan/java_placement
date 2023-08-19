import java.util.Scanner;

// *********
//  *******
//   *****
//    ***
//     *
public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= size; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= size - i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
