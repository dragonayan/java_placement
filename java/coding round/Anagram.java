import java.util.*;

public class Anagram {
    public static boolean func(String a, String b) {
        HashSet<Character> s1 = new HashSet<>();
        HashSet<Character> s2 = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            s1.add(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            s2.add(b.charAt(i));
        }
        if (s1.size() != s2.size()) {
            return false;
        }

        s1.removeAll(s2);
        if (s1.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean ans = func(a, b);
        if (ans == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
