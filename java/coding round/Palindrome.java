import java.util.Scanner;

public class Palindrome {
    public static void func(int i) {
        
            int a = i;
            int s = 0;
            while (a != 0) {
                int r = a % 10;
                s = s * 10 + r;
                a = a / 10;
            }
            if(s==i){
                System.out.print(i+" ");
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = sc.nextInt();
        int lower = sc.nextInt();
        for(int i=upper;i<=lower;i++){
            func(i);
        }

    }

}
