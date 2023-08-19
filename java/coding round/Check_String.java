import java.util.*;

public class Check_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        HashSet<Character> h1 = new HashSet<>();
        HashSet<Character> h2 = new HashSet<>();
        for (int i = 0; i < a.length() ; i++) {
            h1.add(a.charAt(i));
        }
        for (int i = 0; i < b.length() ; i++) {
            h2.add(b.charAt(i));
        }
       

        if (h1.equals(h2)) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }

    }
}
