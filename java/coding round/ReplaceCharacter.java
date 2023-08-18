import java.util.*;

public class ReplaceCharacter {
    public static String func(String name, Character a, Character b) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == a) {
                s.append(b);

            } else if (name.charAt(i) == b) {
                s.append(a);
            } else {
                s.append(name.charAt(i));
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = name.length();
        Character a = sc.next().charAt(0);
        Character b = sc.next().charAt(0);
        String ans = func(name, a, b);
        System.out.println(ans);

    }
}
