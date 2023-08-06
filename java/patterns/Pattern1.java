import java.util.*;
import java.io.*;

 class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=m-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}