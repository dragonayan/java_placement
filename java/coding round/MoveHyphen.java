import java.util.Scanner;

public class MoveHyphen {
    public static String func(String name) {

        // char[] result = new char[name.length()];
        StringBuilder result = new StringBuilder("");
        int k = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '-') {
                result.append(name.charAt(i));

            }
        }
        for (int m = 0; m < name.length(); m++) {
            if (name.charAt(m) != '-') {
                result.append(name.charAt(m));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ans = func(name);
        System.out.println(ans);

    }
}
