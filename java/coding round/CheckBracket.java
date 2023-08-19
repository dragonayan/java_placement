import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Stack<Character> s = new Stack<>();
        char[] ans = a.toCharArray();
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == '(') {
                s.push(ans[i]);
            } else if (ans[i] == ')' && !s.isEmpty()) {
                s.pop();
            } else if (ans[i] == ')' && s.isEmpty()) {
                System.out.println("false");
                return;
            }
        }
        if (s.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
