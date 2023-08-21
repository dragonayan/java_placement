import java.util.Scanner;

class MinCost {
    public static boolean isVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static int minCost(String s) {
        int n = s.length();
        int ans1 = 0, ans2 = 0, ans3 = 0, ans4 = 0, ans5 = 0;
        int con = 0;
        for (int i = 0; i < n; i++) {

            char a = s.charAt(i);
            if (!isVowel(a)) {
                con++;
            } else if (isVowel(a)) {
                if (a != 'a') {
                    ans1 += Math.abs(a - 'a');
                }
                if (a != 'e') {
                    ans2 += Math.abs(a - 'e');
                }
                if (a != 'i') {
                    ans3 += Math.abs(a - 'i');
                }
                if (a != 'o') {
                    ans4 += Math.abs(a - 'o');
                }
                if (a != 'u') {
                    ans5 += Math.abs(a - 'u');
                }
            }
        }

        return (Math.min(ans1, Math.min(ans2, Math.min(ans3, Math.min(ans4, ans5)))) + con * 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int ans = minCost(name);
        System.out.println(ans);
    }
}
