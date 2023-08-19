import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char[] name2 = name.toCharArray();
        StringBuilder ans = new StringBuilder("");
        if (name2[0] == '-') {
            ans.append('-');
            for (int i = name2.length - 1; i > 0; i--) {
            ans.append(name2[i]);
        }
        for (int k = 0; k < ans.length(); k++) {
            System.out.print(ans.charAt(k));
        }

        }else{
            for (int i = name2.length - 1; i >= 0; i--) {
            ans.append(name2[i]);
        }
        for (int k = 0; k < ans.length(); k++) {
            System.out.print(ans.charAt(k));
        }

        }
        

    }
}