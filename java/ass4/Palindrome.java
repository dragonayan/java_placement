import java.util.*;
import java.io.*;

public class Palindrome {
    public static void palindrome(String input) {
        char[] ans = input.toCharArray();
        char[] res = new char[ans.length];
        for (int i = ans.length - 1; i >= 0; i--) {
            res[ans.length - i - 1] = ans[i];
        }
         res.toString();
         System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
         palindrome(input);
        
    }
}
