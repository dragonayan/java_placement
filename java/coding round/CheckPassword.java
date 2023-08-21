import java.util.*;

public class CheckPassword {
    public static int CheckPassword(String s, int n) {
        if (n < 4)
            return 0;
        int count = 0;
        int captial = 0;
        int character = 0;
        if (Character.isDigit(s.charAt(0))) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            char d = s.charAt(i);
            if ((d == ' ') || (d == '/')) {

               return 0;
            }
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
            
            if((d>='A') && (d<='Z')){
                captial++;
            }
    //        

        }
        if (count > 0 && captial > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int size = input.length();
        int ans = CheckPassword(input, size);
        System.out.println(ans);
    }
}
