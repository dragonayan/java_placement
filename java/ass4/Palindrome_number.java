import java.util.*;
import java.io.*;

public class Palindrome_number {
    public static int palindromeCheck(int num) {
        int a = num;
        int d = 0;
        while (num > 0) {
            int remainder = num % 10;
            d = d*10 + remainder;
            num = num / 10;
        }
        if(d==a)return 1;
        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int ans=palindromeCheck(num);
        if(ans==1){
            System.out.println("Palindrome number");
        }else{
            System.out.println("not palindrome");
        }
        int a=10;
        
}
}
