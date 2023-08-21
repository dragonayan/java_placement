import java.util.*;

public class P9 {
//     
//  *
//   *
//    *
//     *
//     *
//    *
//   *
//  *
// *
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i + 1; j++) {
                if( j==size-i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
