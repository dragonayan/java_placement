import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve();
        }
        scanner.close();
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();
        int n1 = s.length();
        int n2 = t.length();

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n1; i++) {
            cnt1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n2; i++) {
            cnt2[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (cnt2[i] > cnt1[i]) {
                System.out.println("YES");
                return;
            }
        }

        Set<Character> st = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            st.add(t.charAt(i));
        }
        if (st.size() == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
