import java.util.*;

public class IsomorphicString {
    public static boolean func(String s, String t) {
        HashMap<Character, Character> mp1 = new HashMap<>();
        HashMap<Character, Character> mp2 = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!mp1.containsKey(s.charAt(i))) {
                mp1.put(s.charAt(i), t.charAt(i));

            } else {
                if (mp1.containsKey(s.charAt(i))) {
                    if (t.charAt(i) != mp1.get(s.charAt(i))) {
                        return false;
                    }
                }
            }
            /// second string
            if (!mp2.containsKey(t.charAt(i))) {
                mp2.put(t.charAt(i), s.charAt(i));

            } else {
                if (mp2.containsKey(t.charAt(i))) {
                    if (s.charAt(i) != mp2.get(t.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean ans = func(s, t);
        if (ans == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
