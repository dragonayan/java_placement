import java.util.*;

public class PalindromeSeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome number");

    }
}
