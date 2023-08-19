import java.util.*;

public class Reverse_A_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
  
        int length = ans.length();
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < length; i++) {
            s.push(ans.charAt(i));
        }
        char[] res = new char[length];
        int m = 0;
        while (!s.isEmpty()) {
            res[m++] = s.pop();
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }
    }
}
